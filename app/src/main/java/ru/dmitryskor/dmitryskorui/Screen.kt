package ru.dmitryskor.dmitryskorui

import androidx.compose.runtime.Composable
import ru.dmitryskor.dmitryskorui.components.Screen_AppBar
import ru.dmitryskor.dmitryskorui.components.Screen_Icon
import ru.dmitryskor.dmitryskorui.components.Screen_IconButton
import ru.dmitryskor.dmitryskorui.components.Screen_OutlinedCard
import ru.dmitryskor.dmitryskorui.components.Screen_Text

enum class Screen(val route: String) {
    APP_BAR("screen_app_bar"),
    ICON("screen_icon"),
    ICON_BUTTON("screen_icon_button"),
    OUTLINED_CARD("screen_outlined_card"),
    TEXT("screen_text"),
}

fun Screen.componentName(): String {
    return when (this) {
        Screen.APP_BAR -> "App bar"
        Screen.ICON -> "Icon"
        Screen.ICON_BUTTON -> "Icon button"
        Screen.OUTLINED_CARD -> "Outlined card"
        Screen.TEXT -> "Text"
    }
}

@Composable
fun GraphComponents(screen: Screen) {
    when (screen) {
        Screen.APP_BAR -> Screen_AppBar()
        Screen.ICON -> Screen_Icon()
        Screen.ICON_BUTTON -> Screen_IconButton()
        Screen.OUTLINED_CARD -> Screen_OutlinedCard()
        Screen.TEXT -> Screen_Text()
    }
}