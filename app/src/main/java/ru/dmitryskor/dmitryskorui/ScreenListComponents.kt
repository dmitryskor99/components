package ru.dmitryskor.dmitryskorui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import ru.dmitryskor.components.card.DS_OutlinedCard
import ru.dmitryskor.components.icon.DS_Icon
import ru.dmitryskor.components.text.DS_Text

@Composable
fun ScreenListComponents(navigateToComponent: (Screen) -> Unit) {
    Column(
        modifier = Modifier
            .verticalScroll(state = rememberScrollState())
            .padding(vertical = 16.0.dp),
        verticalArrangement = Arrangement.spacedBy(8.0.dp)
    ) {
        Screen.entries.forEach {
            ComponentItem(it) {
                navigateToComponent(it)
            }
        }
    }
}

@Composable
private fun ComponentItem(
    component: Screen,
    onClick: () -> Unit
) {
    DS_OutlinedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.0.dp),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier.padding(16.0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            DS_Text(
                modifier = Modifier.weight(1f),
                text = component.componentName(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.width(16.0.dp))
            DS_Icon(
                painter = painterResource(id = R.drawable.ic_arrow_forward_24),
                contentDescription = null
            )
        }
    }
}