package org.openrndr.android.demo

import android.content.Context
import org.openrndr.SensorRate
import org.openrndr.androidApplication
import org.openrndr.color.ColorRGBa

fun demoLight(context: Context) = androidApplication(context) {
    program {
        val force = 0.3
        var light = 0.0

        light(SensorRate.GAME).updateEvent.listen { event ->
            light = event.light
        }

        extend {
            drawer.fill = ColorRGBa.PINK
            drawer.circle(
                x = width * 0.5,
                y = height * 0.5,
                30 + light * force
            )
        }
    }
}