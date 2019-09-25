/*
 *
 *   CameraMonitor
 *    a simple application to view cameras that you have configured
 *
 *    Copyright (C) 2019  Manuel Gonzales Jr.
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see [http://www.gnu.org/licenses/].
 *
 */

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
