package ru.dmitryskor.components.theme.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class DS_Colors_Accent(
    val primary: Color
)

private val primaryLight: Color = Color(0xFFEDA4A4)
private val primaryDark: Color = Color.Unspecified

internal val accentLight: DS_Colors_Accent = DS_Colors_Accent(
    primary = primaryLight
)

internal val accentDark: DS_Colors_Accent = DS_Colors_Accent(
    primary = primaryDark
)