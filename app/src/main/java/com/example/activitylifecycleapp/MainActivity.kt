package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "On Create")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "On Start")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "On Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "On Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "On Destroy")
    }
    }
