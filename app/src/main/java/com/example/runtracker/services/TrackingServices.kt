package com.example.runtracker.services

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.example.runtracker.other.Constants.ACTION_PAUSE_SERVICE
import com.example.runtracker.other.Constants.ACTION_START_OR_RESUME_SERVICE
import com.example.runtracker.other.Constants.ACTION_STOP_SERVICE
import timber.log.Timber

class TrackingServices: LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when (it.action) {
                ACTION_START_OR_RESUME_SERVICE -> Timber.d("Started or resumed")
                ACTION_PAUSE_SERVICE -> Timber.d("Service Paused")
                ACTION_STOP_SERVICE -> Timber.d("Service Stopped")
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}