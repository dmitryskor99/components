package ru.dmitryskor.components.theme.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class DS_Colors_Icon(
    val primary: Color
)

private val primaryLight: Color = Color(0xFF000000)
private val primaryDark: Color = Color.Unspecified

internal val iconLight: DS_Colors_Icon = DS_Colors_Icon(
    primary = primaryLight
)

internal val iconDark: DS_Colors_Icon = DS_Colors_Icon(
    primary = primaryDark
)