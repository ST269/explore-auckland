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
        ),
        Venue(
            id = 2,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_2,
            locationResourceId = R.string.venue_location_2,
            descriptionResourceId = R.string.venue_description_2,
            listItemBackgroundImageResourceId = R.drawable.venue_2_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_2_display_image
        ),
        Venue(
            id = 3,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_3,
            locationResourceId = R.string.venue_location_3,
            descriptionResourceId = R.string.venue_description_3,
            listItemBackgroundImageResourceId = R.drawable.venue_3_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_3_display_image
        ),
        Venue(
            id = 4,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_4,
            locationResourceId = R.string.venue_location_4,
            descriptionResourceId = R.string.venue_description_4,
            listItemBackgroundImageResourceId = R.drawable.venue_4_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_4_display_image
        ),
        Venue(
            id = 5,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_5,
            locationResourceId = R.string.venue_location_5,
            descriptionResourceId = R.string.venue_description_5,
            listItemBackgroundImageResourceId = R.drawable.venue_5_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_5_display_image
        ),
        Venue(
            id = 6,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 7,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        ),
        Venue(
            id = 8,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_8,
            locationResourceId = R.string.venue_location_8,
            descriptionResourceId = R.string.venue_description_8,
            listItemBackgroundImageResourceId = R.drawable.venue_8_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_8_display_image
        ),
        Venue(
            id = 9,
            venueType = VenueType.Drink,
            nameResourceId = R.string.venue_name_9,
            locationResourceId = R.string.venue_location_9,
            descriptionResourceId = R.string.venue_description_9,
            listItemBackgroundImageResourceId = R.drawable.venue_9_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_9_display_image
        ),
        Venue(
            id = 10,
            venueType = VenueType.Drink,
            nameResourceId = R.string.venue_name_11,
            locationResourceId = R.string.venue_location_11,
            descriptionResourceId = R.string.venue_description_11,
            listItemBackgroundImageResourceId = R.drawable.venue_11_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_11_display_image
        ),
        Venue(
            id = 11,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 12,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        ),
        Venue(
            id = 13,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 14,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        ),
        Venue(
            id = 15,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 16,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        ),
        Venue(
            id = 17,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 18,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        ),
        Venue(
            id = 19,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 20,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        ),
        Venue(
            id = 21,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 22,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        ),
        Venue(
            id = 23,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 24,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        ),
        Venue(
            id = 25,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_6,
            locationResourceId = R.string.venue_location_6,
            descriptionResourceId = R.string.venue_description_6,
            listItemBackgroundImageResourceId = R.drawable.venue_6_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_6_display_image
        ),
        Venue(
            id = 26,
            venueType = VenueType.Eat,
            nameResourceId = R.string.venue_name_7,
            locationResourceId = R.string.venue_location_7,
            descriptionResourceId = R.string.venue_description_7,
            listItemBackgroundImageResourceId = R.drawable.venue_7_list_item_image,
            displayVenueImageResourceId = R.drawable.venue_7_display_image
        )



    )

    val eatVenues = allVenues.filter { it.venueType == VenueType.Eat }
    val drinkVenues = allVenues.filter { it.venueType == VenueType.Drink }
    val playVenues = allVenues.filter { it.venueType == VenueType.Play }
}