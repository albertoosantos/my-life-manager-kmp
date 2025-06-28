package oliveira.alberto.mylifemanager.components.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import mylifemanagerkmp.composeapp.generated.resources.Res
import mylifemanagerkmp.composeapp.generated.resources.finance
import oliveira.alberto.mylifemanager.components.TabContent
import org.jetbrains.compose.resources.painterResource

object FinanceTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = painterResource(Res.drawable.finance)

            return remember {
                TabOptions(index = 2u, title = "Finance", icon = icon)
            }
        }

    @Composable
    override fun Content() {
        TabContent()
    }
}