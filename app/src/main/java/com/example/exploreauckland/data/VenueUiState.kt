package com.example.exploreauckland.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.exploreauckland.R

data class VenueUiState(
    @StringRes val currentVenueName: Int = R.string.venue_name_1,
    @DrawableRes val currentVenueImage: Int = R.drawable.venue_1_display_image,
    @StringRes val currentVenueDescription: Int = R.string.venue_description_1,
    @StringRes val currentVenueLocation: Int = R.string.venue_location_1
)
