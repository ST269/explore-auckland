package com.example.exploreauckland.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exploreauckland.data.VenueUiState
import com.example.exploreauckland.ui.theme.ExploreAucklandTheme

@Composable
fun DisplayVenueScreen(
    venueUiState: VenueUiState
) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(venueUiState.currentVenueImage),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().heightIn(max = 300.dp)
            )
            Text(
                text = stringResource(venueUiState.currentVenueName),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
        Text(
            text = stringResource(venueUiState.currentVenueLocation),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp),
        )
        Divider(
            thickness = 2.dp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth(0.7f)
        )
        Text(
            text = stringResource(venueUiState.currentVenueDescription),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 32.dp, top = 16.dp, start = 16.dp, end = 16.dp)
        )
    }
}



@Composable
@Preview(showBackground = true)
fun DisplayVenueScreenPreview(){
    ExploreAucklandTheme {
        DisplayVenueScreen(venueUiState = VenueUiState())
    }
}