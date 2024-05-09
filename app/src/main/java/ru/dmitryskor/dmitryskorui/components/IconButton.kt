package ru.dmitryskor.dmitryskorui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.runtime.Composable
import ru.dmitryskor.components.button.DS_IconButton
import ru.dmitryskor.components.icon.DS_Icon

@Composable
fun Screen_IconButton() {
    DS_IconButton(onClick = {}) {
        DS_Icon(imageVector = Icons.Outlined.Check)
    }
}