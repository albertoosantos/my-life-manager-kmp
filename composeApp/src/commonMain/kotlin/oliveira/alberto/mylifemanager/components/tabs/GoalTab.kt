package oliveira.alberto.mylifemanager.components.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import mylifemanagerkmp.composeapp.generated.resources.Res
import mylifemanagerkmp.composeapp.generated.resources.goal
import oliveira.alberto.mylifemanager.components.TabContent
import org.jetbrains.compose.resources.painterResource

object GoalTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = painterResource(Res.drawable.goal)

            return remember {
                TabOptions(index = 3u, title = "Goals", icon = icon)
            }
        }

    @Composable
    override fun Content() {
        TabContent()
    }
}