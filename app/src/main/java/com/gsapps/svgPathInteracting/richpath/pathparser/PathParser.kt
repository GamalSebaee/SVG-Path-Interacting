package com.gsapps.svgPathInteracting.richpath.pathparser

import android.graphics.Path
import androidx.core.graphics.PathParser

object PathParser {
    fun createPathFromPathData(pathData: String?): Path {
        return PathParser.createPathFromPathData(pathData) ?: Path()
    }
}
