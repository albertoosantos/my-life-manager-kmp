package oliveira.alberto.mylifemanager.ui.goal.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import oliveira.alberto.mylifemanager.ui.goal.register.RegisterGoalScreen
import org.kodein.di.compose.rememberInstance

class GoalScreen : Screen {
    companion object {
        val index: UShort = 3u
    }

    @Composable
    override fun Content() {
        val viewModel: GoalViewModel by rememberInstance<GoalViewModel>()
        val navigator = LocalNavigator.current
        Text("Goal")

        Box(modifier = Modifier.fillMaxSize()) {
            FloatingActionButton(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp),
                onClick = { navigator?.push(RegisterGoalScreen) },
                content = { Text("Add") }
            )
        }
    }
}