package ru.dmitryskor.dmitryskorui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import ru.dmitryskor.components.appBar.DS_TopAppBar
import ru.dmitryskor.components.button.DS_IconButton
import ru.dmitryskor.components.icon.DS_Icon
import ru.dmitryskor.components.text.DS_Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen_AppBar() {
    DS_TopAppBar(
        title = {
            DS_Text(text = "Title")
        },
        navigationIcon = {
            DS_IconButton(onClick = {}) {
                DS_Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack)
            }
        },
        actions = {
            DS_IconButton(onClick = {}) {
                DS_Icon(imageVector = Icons.Filled.Add)
            }
        }
    )
}