# SimpleCalendar

Overview

This is my simple calendar for android written by Kotlin. The purpose of developing this app is to study Kotlin programing, so it is very simple and has only minimum requirement functions.

Main Menue

Calendar is shown on the upper side, and schedules you registerd are displayed on under side. To express calendar, I used opensource "Compact Calendar View(https://github.com/SundeepK/CompactCalendarView)", and schedule list is expressed using widget "recycler view".
The day you regesterd schedule on has green point and when you tap this day, schedules you registerd are shown below. Then you tap these schedule lists and screen shift to edit menue. To add new schedule, please tap lower-right button.


Edit Menue


In this menue, you can add or edit schedule, which has information as "Title", "Place", "Start Time", "End Time" and "Detail". When you tap the icon next to the "place", you can sarch keyword written on the "place" label using map app(like "Google map") installed in your terminal.  
Tapping "save" button, you can save the schedule and green point appears on the day of main menue.Deletion of schedule also can be done on this menu, choosing button lower-light side. To store these data, I use "Realm(https://realm.io/jp/)".

Reference

・はじめてのAndroidプログラミング 第4版 (金田 浩明) https://www.sbcr.jp/product/4815601140/
・https://github.com/SundeepK/CompactCalendarView
・https://realm.io/jp/
