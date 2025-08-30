package oliveira.alberto.mylifemanager

import android.content.Context
import oliveira.alberto.mylifemanager.data.database.AppDatabase
import oliveira.alberto.mylifemanager.data.database.getRoomDatabase
import oliveira.alberto.mylifemanager.data.getDatabaseBuilder
import org.kodein.di.DI
import org.kodein.di.bindSingleton
import org.kodein.di.instance

actual fun platformModule() = DI.Module {
    bindSingleton<AppDatabase> {
        getRoomDatabase(
            builder = getDatabaseBuilder(ctx = instance<Context>())
        )
    }
}