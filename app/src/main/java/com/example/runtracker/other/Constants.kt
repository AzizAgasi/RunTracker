package com.example.runtracker.other

import android.graphics.Color

object Constants {
    const val RUNNING_DATABASE_NAME = "running_db"
    const val REQUEST_CODE_LOCATION_PERMISSION = 0

    const val ACTION_START_OR_RESUME_SERVICE = "ACTION_START_OR_RESUME_SERVICE"
    const val ACTION_PAUSE_SERVICE = "ACTION_PAUSE_SERVICE"
    const val ACTION_STOP_SERVICE = "ACTION_STOP_SERVICE"
    const val ACTION_SHOW_TRACKING_FRAGMENT = "ACTION_SHOW_TRACKING_FRAGMENT"

    const val TIMER_UPDATE_INTERVAL = 50L

    const val LOCATION_UPDATE_INTERVAL = 5000L
    const val FASTEST_LOCATION_INTERVAL = 2000L

    const val POLYLINE_COLOR = Color.RED
    const val POLYLINE_WIDTH = 8f
    const val MAP_ZOOM = 15f

    const val NOTIFICATION_CHANNEL_ID = "tracking_channel"
    const val NOTIFICATION_CHANNEL_NAME = "Tracking"
    const val NOTIFICATION_ID = 1

    const val SORT_RUN_BY_DATE = "timestamp"
    const val SORT_RUN_BY_TIME = "timemili"
    const val SORT_RUN_BY_CALORIES_BURNED = "calories"
    const val SORT_RUN_BY_SPEED = "speed"
    const val SORT_RUN_BY_DISTANCE = "distance"

    const val SHARED_PREFERENCES = "sharedPref"
    const val KEY_FIRST_TIME_TOGGLE = "firstTimeToggle"
    const val KEY_NAME = "key_name"
    const val KEY_WEIGHT = "key_weight"
}