package com.example.exploreauckland.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class VenueDestinations() {
    Start,
    Eat,
    Drink,
    Play,
    Display,
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreAucklandApp(
    viewModel: VenueViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        topBar = {}
    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = VenueDestinations.Start.name,
            modifier = Modifier.padding(innerPadding)
            ) {
            composable(route = VenueDestinations.Start.name) {
                StartScreen()
            }
        }
    }
}