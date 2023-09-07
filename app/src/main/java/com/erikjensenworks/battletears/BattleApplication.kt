package com.erikjensenworks.battletears

import android.app.Application
import androidx.room.Room
import com.erikjensenworks.battletears.data.AppDb

class BattleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val db = Room.databaseBuilder(
            applicationContext,
            AppDb::class.java, "warcry-db"
        ).build()
    }

    // Other custom methods or fields

}