package oliveira.alberto.mylifemanager.data.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import oliveira.alberto.mylifemanager.data.entities.GoalsEntity

@Dao
interface GoalsDao {
    @Insert
    suspend fun insert(item: GoalsEntity)

    @Query("SELECT * FROM GoalsEntity WHERE id = :id")
    fun getByIdAsFlow(id: Long): Flow<GoalsEntity>

    @Query("SELECT * FROM GoalsEntity")
    fun getAllAsFlow(): Flow<List<GoalsEntity>>
}