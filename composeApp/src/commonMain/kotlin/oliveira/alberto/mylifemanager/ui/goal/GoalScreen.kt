package oliveira.alberto.mylifemanager.ui.goal

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import org.kodein.di.compose.rememberInstance

class GoalScreen : Screen {
    companion object {
        val index: UShort = 3u
    }

    @Composable
    override fun Content() {
        val viewModel: GoalViewModel by rememberInstance<GoalViewModel>()
        Text("Goal")
    }
}