package com.example.exploreauckland.data

import com.example.exploreauckland.R
import com.example.exploreauckland.model.Venue
import com.example.exploreauckland.model.VenueType

object DataSource {
    private val allVenues = listOf<Venue>(
        Venue(
            id = 1,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_1,
            locationResourceId = R.string.venue_location_1,
            descriptionResourceId = R.string.venue_description_1,
            listItemBackgroundImageResourceId = R.drawable.venue_1_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_1_display_image
        )

    )

    val eatVenues = allVenues.filter { it.venueType == VenueType.Eat }
    val drinkVenues = allVenues.filter { it.venueType == VenueType.Drink }
    val playVenues = allVenues.filter { it.venueType == VenueType.Play }
}