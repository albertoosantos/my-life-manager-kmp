package oliveira.alberto.mylifemanager.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.*
import cafe.adriel.voyager.core.screen.Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

class HomeScreen : Screen {

    companion object {
        val index: UShort = 0u
    }

    @Composable
    override fun Content() {
        HomeScreenContent()
    }

    @Composable
    @Preview
    fun HomeScreenContent() {
        Text("Home")
    }
}