package org.openrndr.android

import org.openrndr.androidApplication
import org.openrndr.color.ColorRGBa

val templateApp = androidApplication {
    program {
        extend {
            // Your drawing code...
            drawer.clear(ColorRGBa.BLACK)
        }
    }
}