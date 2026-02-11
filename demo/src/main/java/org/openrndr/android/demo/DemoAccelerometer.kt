package org.openrndr.android.demo

import android.content.Context
import org.openrndr.SensorRate
import org.openrndr.androidApplication
import org.openrndr.color.ColorRGBa
import org.openrndr.math.Vector3

fun demoAccelerometer(context: Context) = androidApplication(context) {
    program {
        val force = 90
        var accelerometer = Vector3.ZERO

        val accel = accelerometer(SensorRate.GAME)
        accel.updateEvent.listen { event ->
            accelerometer = Vector3(x = event.x, y = event.y, z = event.z)
        }

        extend {
            drawer.fill = ColorRGBa.PINK
            drawer.circle(
                x = width * 0.5 - accelerometer.x * force,
                y = height * 0.5 + accelerometer.y * force,
                100.0
            )
        }
    }
}