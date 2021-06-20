package com.thefinestartist.finestwebview.helpers

import android.graphics.Color

/**
 * Created by Leonardo on 11/28/15.
 */
object ColorHelper {
    @JvmStatic
    fun disableColor(color: Int): Int {
        val alpha = Color.alpha(color)
        val red = Color.red(color)
        val green = Color.green(color)
        val blue = Color.blue(color)
        return Color.argb((alpha * 0.2f).toInt(), red, green, blue)
    }
}