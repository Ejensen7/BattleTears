package com.erikjensenworks.battletears.data

import androidx.room.TypeConverter

class RunemarkConverter {

    @TypeConverter
    fun fromRunemarkList(runemarks: List<Runemark>): String {
        return runemarks.joinToString(separator = ",") { it.name }
    }

    @TypeConverter
    fun toRunemarkList(data: String): List<Runemark> {
        return data.split(",").map { Runemark.valueOf(it) }
    }


}