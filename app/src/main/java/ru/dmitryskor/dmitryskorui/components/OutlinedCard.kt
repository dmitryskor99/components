package ru.dmitryskor.dmitryskorui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.dmitryskor.components.card.DS_OutlinedCard
import ru.dmitryskor.components.text.DS_Text

@Composable
fun Screen_OutlinedCard() {
    DS_OutlinedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.0.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.0.dp),
            contentAlignment = Alignment.Center
        ) {
            DS_Text(text = "Any content")
        }
    }
}