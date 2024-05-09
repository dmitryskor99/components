package ru.dmitryskor.components.button

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ru.dmitryskor.components.theme.LocalColors

@Composable
fun DS_IconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = ds_IconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource,
        content = content
    )
}

@Composable
fun ds_IconButtonColors(
    containerColor: Color = Color.Unspecified,
    contentColor: Color = LocalColors.current.icon.primary,
    disabledContainerColor: Color = Color.Unspecified,
    disabledContentColor: Color = contentColor.copy(alpha = 0.38f)
): IconButtonColors = IconButtonDefaults.iconButtonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor,
)