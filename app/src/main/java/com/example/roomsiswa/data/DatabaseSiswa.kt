package com.example.roomsiswa.data

import androidx.room.Database

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
data class DatabaseSiswa()
