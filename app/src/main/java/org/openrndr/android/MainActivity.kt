package org.openrndr.android

import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import org.openrndr.androidApplication
import org.openrndr.internal.android.createSurfaceView

class MainActivity : ComponentActivity() {

    private lateinit var surfaceView: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        androidApplication {
            program {
                extend {
                    // Your drawing code...
                }
            }
        }

        surfaceView = createSurfaceView(this)
        setContentView(surfaceView)
    }

    override fun onPause() {
        super.onPause()
        surfaceView.onPause()
    }

    override fun onResume() {
        super.onResume()
        surfaceView.onResume()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}