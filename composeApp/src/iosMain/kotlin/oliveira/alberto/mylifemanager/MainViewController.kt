package oliveira.alberto.mylifemanager

import androidx.compose.ui.window.ComposeUIViewController
import oliveira.alberto.mylifemanager.ui.HomeScreen

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    HomeScreen()
}