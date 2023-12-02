package com.example.exploreauckland.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.example.exploreauckland.R
import com.example.exploreauckland.data.DataSource

enum class VenueDestinations {
    Start,
    Eat,
    Drink,
    Play,
    Display,
}

enum class TopLevelDestinations(
    @DrawableRes val iconImage: Int,
) {
    Eat(iconImage = R.drawable.icons8_eat_50),
    Drink(iconImage = R.drawable.icons8_drink_50),
    Play(iconImage = R.drawable.icons8_museum_50),
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreAucklandApp(
    viewModel: VenueViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    // Get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = VenueDestinations.valueOf(
        backStackEntry?.destination?.route ?: VenueDestinations.Start.name
    )

    Scaffold(
        topBar = {},
        bottomBar = {
            if (currentScreen != VenueDestinations.Start) {
                ExploreAucklandBottomAppBar(
                    destinations = TopLevelDestinations.values().asList(),
                    currentScreen = currentScreen,
                    onNavigateToDestination = {
                        // Nav options so that when the back button is pressed goes back to start destination
                        val navOptions = navOptions {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            // Stops multiple copies of the same destination
                            launchSingleTop = true
                        }
                        navController.navigate(route = it.name, navOptions = navOptions)
                    }
                )
            }
        }

    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = VenueDestinations.Start.name,
            modifier = Modifier.padding(innerPadding)
            ) {
            composable(route = VenueDestinations.Start.name) {
                StartScreen(
                    onGetStartedClick = { navController.navigate(VenueDestinations.Eat.name) }
                )
            }
            composable(route = VenueDestinations.Eat.name) {
                EatDrinkPlayScreen(
                    venueList = DataSource.eatVenues,
                    onCardClicked = {
                        viewModel.updateState(it)
                        navController.navigate(VenueDestinations.Display.name)
                    }
                )
            }
            composable(route = VenueDestinations.Drink.name) {
                EatDrinkPlayScreen(
                    venueList = DataSource.drinkVenues,
                    onCardClicked = {
                        viewModel.updateState(it)
                        navController.navigate(VenueDestinations.Display.name)
                    }
                )
            }
            composable(route = VenueDestinations.Play.name) {
                EatDrinkPlayScreen(
                    venueList = DataSource.playVenues,
                    onCardClicked = {
                        viewModel.updateState(it)
                        navController.navigate(VenueDestinations.Display.name)
                    }
                )
            }
            composable(route = VenueDestinations.Display.name) {
                DisplayVenueScreen(uiState)
            }
        }
    }
}

@Composable
fun ExploreAucklandBottomAppBar(
destinations: List<TopLevelDestinations>,
currentScreen: VenueDestinations,
onNavigateToDestination: (TopLevelDestinations) -> Unit
) {
    NavigationBar (
        modifier = Modifier.heightIn(max = 60.dp)
    ) {
        destinations.forEach {destination ->
            val selected = currentScreen.name == destination.name
            NavigationBarItem(
                selected = selected,
                onClick = { onNavigateToDestination(destination) },
                icon = {
                    Icon(
                        painter = painterResource(destination.iconImage),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(0.6f)
                    )
                }
            )
        }
    }
}

