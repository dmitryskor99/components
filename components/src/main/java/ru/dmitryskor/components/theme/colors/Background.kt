package ru.dmitryskor.components.theme.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class DS_Colors_Background(
    val primary: Color,
    val secondary: Color
)

private val primaryLight: Color = Color(0xFFFFFFFF)
private val primaryDark: Color = Color.Unspecified

private val secondaryLight: Color = Color(0xFFD9D9D9)
private val secondaryDark: Color = Color.Unspecified

internal val backgroundLight: DS_Colors_Background = DS_Colors_Background(
    primary = primaryLight,
    secondary = secondaryLight,
)

internal val backgroundDark: DS_Colors_Background = DS_Colors_Background(
    primary = primaryDark,
    secondary = secondaryDark,
)