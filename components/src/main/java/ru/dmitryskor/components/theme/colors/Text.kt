package ru.dmitryskor.components.theme.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class DS_Colors_Text(
    val primary: Color
)

private val primaryLight: Color = Color(0xFF000000)
private val primaryDark: Color = Color.Unspecified

internal val textLight: DS_Colors_Text = DS_Colors_Text(
    primary = primaryLight
)

internal val textDark: DS_Colors_Text = DS_Colors_Text(
    primary = primaryDark
)