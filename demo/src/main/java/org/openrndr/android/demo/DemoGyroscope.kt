package org.openrndr.android.demo

import android.content.Context
import org.openrndr.SensorRate
import org.openrndr.androidApplication
import org.openrndr.color.ColorRGBa
import org.openrndr.math.Vector3

fun demoGyroscope(context: Context) = androidApplication(context) {
    program {
        val force = 30
        var gyroscope = Vector3.ZERO

        val gyro = gyroscope(SensorRate.GAME)
        gyro.updateEvent.listen { event ->
            gyroscope = Vector3(x = event.pitch, y = event.roll, z = event.yaw)
        }

        extend {
            drawer.fill = ColorRGBa.PINK
            drawer.circle(
                x = width * 0.5 + gyroscope.y * force,
                y = height * 0.5 + gyroscope.x * force,
                100.0
            )
        }
    }
}