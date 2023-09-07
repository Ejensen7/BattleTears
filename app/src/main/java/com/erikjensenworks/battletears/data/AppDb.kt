package com.erikjensenworks.battletears.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.erikjensenworks.battletears.dao.FighterDao

@Database(entities = [Fighter::class, Weapon::class], version = 1)
@TypeConverters(RunemarkConverter::class)
abstract class AppDb : RoomDatabase(){
    abstract fun fighterDao(): FighterDao
}