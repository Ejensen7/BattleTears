package com.erikjensenworks.battletears.data

import androidx.room.Embedded
import androidx.room.Relation

data class FighterCard(
    @Embedded val fighter: Fighter,
    @Relation(
        parentColumn = "id",
        entityColumn = "fighterId"
    )
    val weapons: List<Weapon>,
)
