package oliveira.alberto.mylifemanager.data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import oliveira.alberto.mylifemanager.data.database.AppDatabase

fun getDatabaseBuilder(ctx: Context): RoomDatabase.Builder<AppDatabase> {
    val appContext = ctx.applicationContext
    val dbFile = appContext.getDatabasePath("my_room.db")
    return Room.databaseBuilder<AppDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}