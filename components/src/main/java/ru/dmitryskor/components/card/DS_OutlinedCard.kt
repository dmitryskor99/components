package ru.dmitryskor.components.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.dmitryskor.components.theme.LocalColors

val DS_OutlineCardShape = RoundedCornerShape(16.0.dp)

@Composable
fun ds_OutlinedCardColors(
    containerColor: Color = Color.Transparent,
    contentColor: Color = Color.Unspecified,
    disabledContainerColor: Color = Color.Transparent,
    disabledContentColor: Color = Color.Unspecified
): CardColors = CardDefaults.outlinedCardColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor
)

@Composable
fun ds_OutlinedCardElevation(
    defaultElevation: Dp = 0.0.dp,
    pressedElevation: Dp = defaultElevation,
    focusedElevation: Dp = defaultElevation,
    hoveredElevation: Dp = defaultElevation,
    draggedElevation: Dp = 6.0.dp,
    disabledElevation: Dp = 0.0.dp
): CardElevation = CardDefaults.outlinedCardElevation(
    defaultElevation = defaultElevation,
    pressedElevation = pressedElevation,
    focusedElevation = focusedElevation,
    hoveredElevation = hoveredElevation,
    draggedElevation = draggedElevation,
    disabledElevation = disabledElevation
)

@Composable
fun ds_OutlinedCardBorder(
    enabled: Boolean = true
) : BorderStroke {
    val color = if (enabled) {
        LocalColors.current.background.secondary
    } else {
        LocalColors.current.background.secondary
            .copy(alpha = 0.12f)
            .compositeOver(
                MaterialTheme.colorScheme.surfaceColorAtElevation(
                    0.0.dp
                )
            )
    }
    return remember(color) { BorderStroke(1.0.dp, color) }
}

@Composable
fun DS_OutlinedCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = DS_OutlineCardShape,
    colors: CardColors = ds_OutlinedCardColors(),
    elevation: CardElevation = ds_OutlinedCardElevation(),
    border: BorderStroke = ds_OutlinedCardBorder(enabled),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable ColumnScope.() -> Unit
) {
    OutlinedCard(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        interactionSource = interactionSource,
        content = content
    )
}

@Composable
fun DS_OutlinedCard(
    modifier: Modifier = Modifier,
    shape: Shape = DS_OutlineCardShape,
    colors: CardColors = ds_OutlinedCardColors(),
    elevation: CardElevation = ds_OutlinedCardElevation(),
    border: BorderStroke = ds_OutlinedCardBorder(),
    content: @Composable ColumnScope.() -> Unit
) {
    OutlinedCard(
        modifier = modifier,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        content = content
    )
}