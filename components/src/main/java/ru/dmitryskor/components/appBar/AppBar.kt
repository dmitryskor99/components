package ru.dmitryskor.components.appBar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ru.dmitryskor.components.theme.LocalColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DS_TopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = ds_TopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    TopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ds_TopAppBarColors(
    containerColor: Color = LocalColors.current.background.primary,
    scrolledContainerColor: Color = containerColor,
    navigationIconContentColor: Color = LocalColors.current.icon.primary,
    titleContentColor: Color = LocalColors.current.text.primary,
    actionIconContentColor: Color = LocalColors.current.icon.primary,
): TopAppBarColors = TopAppBarDefaults.topAppBarColors(
    containerColor = containerColor,
    scrolledContainerColor = scrolledContainerColor,
    navigationIconContentColor = navigationIconContentColor,
    titleContentColor = titleContentColor,
    actionIconContentColor = actionIconContentColor
)