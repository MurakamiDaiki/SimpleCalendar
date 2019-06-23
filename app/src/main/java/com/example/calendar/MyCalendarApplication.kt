package com.example.calendar

import android.app.Application
import io.realm.Realm

class MyCalendarApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}