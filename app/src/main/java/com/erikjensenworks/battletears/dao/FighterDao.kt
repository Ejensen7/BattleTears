package com.erikjensenworks.battletears.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.erikjensenworks.battletears.data.Fighter
import com.erikjensenworks.battletears.data.FighterCard

@Dao
interface FighterDao {
    @Query("SELECT * FROM Fighter")
    fun getAll(): List<Fighter>

    @Transaction
    @Query("SELECT * FROM Fighter WHERE id = :fighterId")
    fun getFighterCard(fighterId: Int): FighterCard

    @Insert
    fun insert(fighter: Fighter): Long

    /* Add in update delete and get by id or others */
}