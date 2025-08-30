package oliveira.alberto.mylifemanager.data.repositories.goals

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import oliveira.alberto.mylifemanager.data.daos.GoalsDao
import oliveira.alberto.mylifemanager.data.entities.GoalsEntity
import oliveira.alberto.mylifemanager.data.entities.toGoals
import oliveira.alberto.mylifemanager.data.models.Goals

internal class GoalsRepositoryImpl(private val goalsDao: GoalsDao): GoalsRepository {
    override suspend fun getAllGoals(): Flow<List<Goals>> {
        return goalsDao.getAllAsFlow().flowListEntityToModel()
    }

    override suspend fun getById(id: Long): Flow<Goals> {
        return goalsDao.getByIdAsFlow(id).flowEntityToModel()
    }
}

private fun Flow<List<GoalsEntity>>.flowListEntityToModel(): Flow<List<Goals>> {
    return this.map { listGoal ->
        listGoal.map { goal ->
            goal.toGoals()
        }
    }
}

private fun Flow<GoalsEntity>.flowEntityToModel(): Flow<Goals> {
    return this.map { goalsEntity -> goalsEntity.toGoals() }
}