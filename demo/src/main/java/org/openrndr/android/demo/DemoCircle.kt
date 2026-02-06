package org.openrndr.android.demo

import android.content.Context
import org.openrndr.androidApplication
import org.openrndr.color.ColorRGBa
import org.openrndr.math.Vector2
import kotlin.math.sin

fun demoCircle(context: Context) = androidApplication(context) {
    program {
        extend {
            drawer.stroke = ColorRGBa.PINK
            drawer.strokeWeight = 10.0
            drawer.fill = ColorRGBa.PINK
            val radius = sin(seconds * 3) * 50 + 150
            drawer.circle(
                Vector2(x = width * 0.5, y = height * 0.5),
                radius
            )
        }
    }
}