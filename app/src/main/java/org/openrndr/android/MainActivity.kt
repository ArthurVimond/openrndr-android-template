package org.openrndr.android

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import org.openrndr.android.demo.demoAccelerometer
import org.openrndr.android.demo.demoGyroscope
import org.openrndr.android.demo.demoLight
import org.openrndr.android.demo.demoMultitouch
import org.openrndr.android.demo.demoText

class MainActivity : ComponentActivity() {

    private lateinit var surfaceView: GLSurfaceView

    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT // Lock to portrait
//        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE // Lock to landscape

        surfaceView = templateApp(this)
//        surfaceView = demoMultitouch(this)
//        surfaceView = demoGyroscope(this)
//        surfaceView = demoAccelerometer(this)
//        surfaceView = demoText(this)
//        surfaceView = demoLight(this)

        setContentView(surfaceView)
    }
}