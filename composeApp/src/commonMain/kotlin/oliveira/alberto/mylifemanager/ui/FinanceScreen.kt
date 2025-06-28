package oliveira.alberto.mylifemanager.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class FinanceScreen : Screen {
    companion object {
        val index: UShort = 1u
    }

    @Composable
    override fun Content() {
        Text("Finance")
    }
}