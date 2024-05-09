package ru.dmitryskor.dmitryskorui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.dmitryskor.components.theme.DS_Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DS_Theme {
                MainGraph()
            }
        }
    }
}