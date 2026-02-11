package org.openrndr.android

import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import org.openrndr.android.demo.demoMultitouch
import org.openrndr.android.demo.demoAccelerometer

class MainActivity : ComponentActivity() {

    private lateinit var surfaceView: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        surfaceView = templateApp(this)
//        surfaceView = demoMultitouch(this)
//        surfaceView = demoAccelerometer(this)

        setContentView(surfaceView)
    }
}