package com.shaadi.match.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Match(
    var name: String = "",
    var gender: String = "",
    var phone: String = "",
    var cell: String = "",
    var email: String = "",
    var nationality: String = "",
    @PrimaryKey(autoGenerate = true) var id: Int = 0
)
