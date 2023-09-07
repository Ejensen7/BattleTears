package com.erikjensenworks.battletears.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Fighter(
    @PrimaryKey(autoGenerate = true) val id: Int,
    private val name: String,
    private val faction: String,
    private val movement: Int,
    private val toughness: Int,
    private val wounds: Int,
    private val points: Int,
    private val runemarks: List<Runemark>,
)
