package org.openrndr.android

import android.content.Context
import org.openrndr.androidApplication
import org.openrndr.color.ColorRGBa

fun templateApp(context: Context) = androidApplication(context) {
    program {
        extend {
            // Your drawing code...
            drawer.clear(ColorRGBa.BLACK)
        }
    }
}