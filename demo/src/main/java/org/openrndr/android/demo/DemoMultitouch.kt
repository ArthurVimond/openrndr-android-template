package org.openrndr.android.demo

import android.content.Context
import org.openrndr.androidApplication
import org.openrndr.color.ColorRGBa
import org.openrndr.math.Vector2

fun demoMultitouch(context: Context) = androidApplication(context) {
    program {
        val pointerPositions = MutableList(10) { Vector2.INFINITY }
        val pointerPressures = MutableList(10) { 0.0 }

        pointers.pointerDown.listen { event ->
            pointerPositions[event.pointerID.toInt()] = event.position
            pointerPressures[event.pointerID.toInt()] = event.pressure
        }
        pointers.moved.listen { event ->
            pointerPositions[event.pointerID.toInt()] = event.position
            pointerPressures[event.pointerID.toInt()] = event.pressure
        }
        pointers.pointerUp.listen { event ->
            pointerPositions[event.pointerID.toInt()] = Vector2.INFINITY
            pointerPressures[event.pointerID.toInt()] = 0.0
        }

        extend {
            drawer.stroke = ColorRGBa.PINK
            drawer.strokeWeight = 15.0
            drawer.fill = ColorRGBa.TRANSPARENT

            pointerPositions.forEachIndexed { index, pointerPosition ->
                val pressure = pointerPressures[index]
                val radius = 100 + pressure
                drawer.circle(pointerPosition, radius)
            }
        }
    }
}