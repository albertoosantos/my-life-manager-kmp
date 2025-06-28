package oliveira.alberto.mylifemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator
import oliveira.alberto.mylifemanager.components.TabContent
import oliveira.alberto.mylifemanager.components.tabs.FinanceTab
import oliveira.alberto.mylifemanager.components.tabs.FitnessTab
import oliveira.alberto.mylifemanager.components.tabs.GoalTab
import oliveira.alberto.mylifemanager.components.tabs.HomeTab
import oliveira.alberto.mylifemanager.ui.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            TabNavigator(
                HomeTab,
            ) { navigator ->
                Scaffold(
                    content = { paddingValues ->
                        Column(
                            modifier = Modifier.padding(paddingValues)
                        ) {
                            CurrentTab()
                        }
                    },
                    bottomBar = {
                        BottomNavigation {
                            TabNavigationItem(HomeTab)
                            TabNavigationItem(FinanceTab)
                            TabNavigationItem(FitnessTab)
                            TabNavigationItem(GoalTab)
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    BottomNavigationItem(
        selected = tabNavigator.current.key == tab.key,
        onClick = { tabNavigator.current = tab },
        icon = { Icon(painter = tab.options.icon!!, contentDescription = tab.options.title) }
    )
}

@Preview
@Composable
fun AppAndroidPreview() {
    HomeScreen()
}