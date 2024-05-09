package ru.dmitryskor.components.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import ru.dmitryskor.components.theme.colors.DS_Colors_Accent
import ru.dmitryskor.components.theme.colors.DS_Colors_Background
import ru.dmitryskor.components.theme.colors.DS_Colors_Icon
import ru.dmitryskor.components.theme.colors.DS_Colors_Text
import ru.dmitryskor.components.theme.colors.accentDark
import ru.dmitryskor.components.theme.colors.accentLight
import ru.dmitryskor.components.theme.colors.backgroundDark
import ru.dmitryskor.components.theme.colors.backgroundLight
import ru.dmitryskor.components.theme.colors.iconDark
import ru.dmitryskor.components.theme.colors.iconLight
import ru.dmitryskor.components.theme.colors.textDark
import ru.dmitryskor.components.theme.colors.textLight

val LocalColors = staticCompositionLocalOf {
    DS_Colors(
        background = DS_Colors_Background(
            primary = Color.Unspecified,
            secondary = Color.Unspecified
        ),
        text = DS_Colors_Text(
            primary = Color.Unspecified
        ),
        accent = DS_Colors_Accent(
            primary = Color.Unspecified
        ),
        icon = DS_Colors_Icon(
            primary = Color.Unspecified
        )
    )
}

@Composable
fun DS_Theme(
    content: @Composable () -> Unit
) {
    val localColors: DS_Colors = if (isSystemInDarkTheme()) {
        DS_Colors(
            background = backgroundDark,
            text = textDark,
            accent = accentDark,
            icon = iconDark
        )
    } else {
        DS_Colors(
            background = backgroundLight,
            text = textLight,
            accent = accentLight,
            icon = iconLight
        )
    }

    CompositionLocalProvider(LocalColors provides localColors) {
        MaterialTheme(
            colorScheme = colorScheme,
            shapes = shapes,
            content = {
                CompositionLocalProvider(LocalRippleTheme provides DS_RippleTheme) {
                    content()
                }
            }
        )
    }
}

@Immutable
data class DS_Colors(
    val background: DS_Colors_Background,
    val text: DS_Colors_Text,
    val accent: DS_Colors_Accent,
    val icon: DS_Colors_Icon
)

object DS_RippleTheme : RippleTheme {
    @Composable
    override fun defaultColor(): Color = if (isSystemInDarkTheme()) {
        accentDark.primary
    } else {
        accentLight.primary
    }

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleTheme.defaultRippleAlpha(
        defaultColor(),
        !isSystemInDarkTheme()
    )

}


private val colorScheme = lightColorScheme(
    primary = Color.Cyan,
    onPrimary = Color.Cyan,
    primaryContainer = Color.Cyan,
    onPrimaryContainer = Color.Cyan,
    inversePrimary = Color.Cyan,
    secondary = Color.Cyan,
    onSecondary = Color.Cyan,
    secondaryContainer = Color.Cyan,
    onSecondaryContainer = Color.Cyan,
    tertiary = Color.Cyan,
    onTertiary = Color.Cyan,
    tertiaryContainer = Color.Cyan,
    onTertiaryContainer = Color.Cyan,
    background = Color.Cyan,
    onBackground = Color.Cyan,
    surface = Color.Cyan,
    onSurface = Color.Cyan,
    surfaceVariant = Color.Cyan,
    onSurfaceVariant = Color.Cyan,
    surfaceTint = Color.Cyan,
    inverseSurface = Color.Cyan,
    inverseOnSurface = Color.Cyan,
    error = Color.Cyan,
    onError = Color.Cyan,
    errorContainer = Color.Cyan,
    onErrorContainer = Color.Cyan,
    outline = Color.Cyan,
    outlineVariant = Color.Cyan,
    scrim = Color.Cyan,
    surfaceBright = Color.Cyan,
    surfaceContainer = Color.Cyan,
    surfaceContainerHigh = Color.Cyan,
    surfaceContainerHighest = Color.Cyan,
    surfaceContainerLow = Color.Cyan,
    surfaceContainerLowest = Color.Cyan,
    surfaceDim = Color.Cyan
)

private val shapes = Shapes(
    extraSmall = AbsoluteRoundedCornerShape(0),
    small = AbsoluteRoundedCornerShape(0),
    medium = AbsoluteRoundedCornerShape(0),
    large = AbsoluteRoundedCornerShape(0),
    extraLarge = AbsoluteRoundedCornerShape(0)
)