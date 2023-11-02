package com.example.exploreauckland.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


enum class VenueType() {
    Eat, Drink, Play
}

data class Venue(
    val id: Int,
    val venueType: VenueType,
    @StringRes val nameResourceId: Int,
    @StringRes val locationResourceId: Int,
    @StringRes val descriptionResourceId: Int,
    @DrawableRes val listItemBackgroundImageResourceId: Int,
    @DrawableRes val displayVenueImageResourceId: Int
)
