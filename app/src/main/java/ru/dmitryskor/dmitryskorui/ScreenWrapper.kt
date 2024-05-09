package ru.dmitryskor.dmitryskorui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ru.dmitryskor.components.appBar.DS_TopAppBar
import ru.dmitryskor.components.button.DS_IconButton
import ru.dmitryskor.components.icon.DS_Icon
import ru.dmitryskor.components.text.DS_Text
import ru.dmitryskor.components.theme.LocalColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenComponentWrapper(
    titleAppBar: String,
    onBack: () -> Unit,
    content: @Composable BoxScope.() -> Unit
) {
    Scaffold(
        topBar = {
            DS_TopAppBar(
                title = {
                    DS_Text(text = titleAppBar)
                },
                navigationIcon = {
                    DS_IconButton(onClick = onBack) {
                        DS_Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack)
                    }
                }
            )
        },
        containerColor = LocalColors.current.background.primary,
        contentColor = Color.Unspecified
    ) {
        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            contentAlignment = Alignment.Center,
            content = content
        )
    }
}