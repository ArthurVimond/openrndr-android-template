package org.openrndr.android.demo

import android.content.Context
import org.openrndr.androidApplication
import org.openrndr.color.ColorRGBa
import org.openrndr.draw.loadFont

fun demoText(context: Context) = androidApplication(context) {
    program {
        val font = loadFont("data/fonts/default.otf", 150.0)
        extend {
            drawer.fontMap = font
            drawer.fill = ColorRGBa.PINK
            drawer.text("OPENRNDR", 50.0, height / 2.0)
        }
    }
}