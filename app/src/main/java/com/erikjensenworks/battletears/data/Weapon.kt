package com.erikjensenworks.battletears.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Weapon(
    @PrimaryKey(autoGenerate = true) val id: Int,
    private val fighterId : Int, // foreign key to Fighter
    private val name: String,
    private val range: Int,
    private val attacks: Int,
    private val strength: Int,
    private val damage: Int,
    private val critDamage: Int,
)
