package oliveira.alberto.mylifemanager.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class GoalScreen : Screen {
    companion object {
        val index: UShort = 3u
    }

    @Composable
    override fun Content() {
        Text("Goal")
    }
}