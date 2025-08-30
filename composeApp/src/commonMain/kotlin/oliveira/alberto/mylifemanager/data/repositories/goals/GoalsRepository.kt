package oliveira.alberto.mylifemanager.data.repositories.goals

import kotlinx.coroutines.flow.Flow
import oliveira.alberto.mylifemanager.data.models.Goals

interface GoalsRepository {
    suspend fun getAllGoals(): Flow<List<Goals>>
    suspend fun getById(id: Long): Flow<Goals>
}