package com.macleod2486.cameramonitor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.macleod2486.cameramonitor.fragments.Main

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainFragment = Main()

        supportFragmentManager.beginTransaction().add(R.id.main, mainFragment, "Main").commit()
    }
}
