package oliveira.alberto.mylifemanager.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.transitions.SlideTransition
import oliveira.alberto.mylifemanager.ui.FinanceScreen
import oliveira.alberto.mylifemanager.ui.FitnessScreen
import oliveira.alberto.mylifemanager.ui.goal.GoalScreen
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

