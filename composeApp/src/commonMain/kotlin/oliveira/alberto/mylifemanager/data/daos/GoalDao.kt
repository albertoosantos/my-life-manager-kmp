package oliveira.alberto.mylifemanager.data.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import oliveira.alberto.mylifemanager.data.entities.GoalEntity

@Dao
interface GoalDao {
    @Insert
    suspend fun insert(item: GoalEntity)

    @Query("SELECT * FROM GoalEntity")
    fun getAllAsFlow(): Flow<List<GoalEntity>>

    @Query("SELECT * FROM GoalEntity WHERE id = :id")
    fun getByIdAsFlow(id: Long): Flow<GoalEntity>

    @Query("SELECT * FROM GoalEntity WHERE active = 1")
    fun getActiveAsFlow(): Flow<List<GoalEntity>>

    @Query("SELECT * FROM GoalEntity WHERE completed = 1")
    fun getCompletedAsFlow(): Flow<List<GoalEntity>>

    @Query("SELECT * FROM GoalEntity WHERE goalsId = :goalsId")
    fun getByGoalsIdAsFlow(goalsId: Long): Flow<List<GoalEntity>>
}