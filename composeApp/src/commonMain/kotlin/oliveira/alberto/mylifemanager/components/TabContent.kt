package oliveira.alberto.mylifemanager.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.transitions.SlideTransition
import oliveira.alberto.mylifemanager.components.tabs.FinanceTab
import oliveira.alberto.mylifemanager.components.tabs.FitnessTab
import oliveira.alberto.mylifemanager.components.tabs.GoalTab
import oliveira.alberto.mylifemanager.components.tabs.HomeTab
import oliveira.alberto.mylifemanager.ui.FinanceScreen
import oliveira.alberto.mylifemanager.ui.FitnessScreen
import oliveira.alberto.mylifemanager.ui.GoalScreen
import oliveira.alberto.mylifemanager.ui.HomeScreen

@Composable
fun Tab.TabContent() {
    val selectedScreen = when(options.index) {
        HomeScreen.index -> HomeScreen()
        FinanceScreen.index -> FinanceScreen()
        FitnessScreen.index -> FitnessScreen()
        GoalScreen.index -> GoalScreen()
        else -> HomeScreen()
    }

    Navigator(selectedScreen) { navigator ->
        SlideTransition(navigator) { screen ->
            Column {
                screen.Content()
            }
        }
    }
}

