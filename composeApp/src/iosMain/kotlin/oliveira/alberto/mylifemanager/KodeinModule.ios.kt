package oliveira.alberto.mylifemanager

import androidx.room.RoomDatabase
import oliveira.alberto.mylifemanager.data.database.AppDatabase
import oliveira.alberto.mylifemanager.data.getDatabaseBuilder
import org.kodein.di.DI
import org.kodein.di.bindSingleton

actual fun platformModule() = DI.Module {
    bindSingleton<RoomDatabase.Builder<AppDatabase>> { getDatabaseBuilder() }
}