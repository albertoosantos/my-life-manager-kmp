package oliveira.alberto.mylifemanager

import android.app.Application
import org.kodein.di.DI
import org.kodein.di.DIAware

class Application : Application(), DIAware {
    override val di by DI.lazy {
        platformModule()
        import(databaseDI)
    }

    override fun onCreate() {
        super.onCreate()
    }
}