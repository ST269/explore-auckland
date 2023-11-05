package com.example.exploreauckland.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exploreauckland.data.DataSource
import com.example.exploreauckland.model.Venue
import com.example.exploreauckland.ui.theme.ExploreAucklandTheme

@Composable
fun EatDrinkPlayScreen(
    venueList: List<Venue>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier = modifier.padding(vertical = 8.dp)) {
        items(venueList, key = {venue -> venue.id}) {
            VenueCard(
                backgroundImage = it.listItemBackgroundImageResourceId,
                venueName = it.nameResourceId
            )
        }
    }
}



@Preview (showBackground = true)
@Composable
fun EatDrinkPlayScreenPreview() {
    ExploreAucklandTheme {
        EatDrinkPlayScreen(venueList = DataSource.eatVenues)
    }
}

@Composable
fun VenueCard(
    modifier: Modifier = Modifier,
    @DrawableRes backgroundImage: Int,
    @StringRes venueName: Int
) {
    val gradient = Brush.verticalGradient(
        colors = listOf(Color.Transparent, Color.Black),
        startY = 0f,
        endY = 350f
    )

    Card (
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Box (
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier
                .fillMaxWidth()
                .height(128.dp)
        ) {
            Box(modifier = Modifier) {
                Image(
                    painter = painterResource(id = backgroundImage),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
                Box(modifier = Modifier.matchParentSize().background(gradient))
            }
            Text(
                text = stringResource(venueName),
                style = MaterialTheme.typography.headlineLarge,
                color = Color.White,
                modifier = Modifier.padding(start = 12.dp, bottom = 8.dp),
            )
        }

    }
}