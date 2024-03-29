package com.example.calendar

import android.graphics.Color
import com.github.sundeepk.compactcalendarview.domain.Event
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Schedule:RealmObject() {
    @PrimaryKey
    var id:Long = 0
    var startTime:Long = Date().time
    var endTime:Long = Date().time
    var title:String = ""
    var place:String = ""
    var detail:String = ""
}