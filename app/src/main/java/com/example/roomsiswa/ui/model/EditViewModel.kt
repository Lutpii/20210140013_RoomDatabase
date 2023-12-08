package com.example.roomsiswa.ui.model

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.roomsiswa.repositori.RepositoriSiswa

class EditViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa
) : ViewModel() {
}