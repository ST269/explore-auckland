package com.example.exploreauckland.ui

import androidx.lifecycle.ViewModel
import com.example.exploreauckland.data.VenueUiState
import com.example.exploreauckland.model.Venue
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class VenueViewModel: ViewModel() {

    // Setting up the state flow for VenueUiState
    private val _uiState = MutableStateFlow(VenueUiState())
    val uiState: StateFlow<VenueUiState> =_uiState.asStateFlow()

    // State is updating by referring to _uiState within the viewmodel
    // and read-only using uiState within the ui itself

    // TODO: Add functions for updating state

    fun updateState(venue: Venue) {
        _uiState.update {
            it.copy(
                currentVenueName = venue.nameResourceId,
                currentVenueDescription = venue.descriptionResourceId,
                currentVenueLocation = venue.locationResourceId,
                currentVenueImage = venue.displayVenueImageResourceId
            )
        }
    }

}