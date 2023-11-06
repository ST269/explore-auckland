package com.example.exploreauckland.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
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
import com.example.exploreauckland.R
import com.example.exploreauckland.ui.theme.ExploreAucklandTheme

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    onGetStartedClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.lights_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .padding(bottom = 64.dp)
        ) {
            Spacer(modifier = Modifier.height(128.dp))
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.widthIn(max = 350.dp),
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Divider(
                thickness = 2.dp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(top = 16.dp, bottom = 16.dp)
            )
            Button(
                onClick = onGetStartedClick
            ) {
                Text(text = stringResource(R.string.get_Started))
            }
        }
    }
}


@Preview
@Composable
fun startScreenPreview() {
    ExploreAucklandTheme {
        StartScreen(onGetStartedClick = {})
    }
}