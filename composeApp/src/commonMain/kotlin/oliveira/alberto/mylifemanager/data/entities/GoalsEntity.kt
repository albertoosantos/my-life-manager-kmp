package oliveira.alberto.mylifemanager.data.entities

import androidx.room.PrimaryKey
import oliveira.alberto.mylifemanager.data.models.Goals

data class GoalsEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val goals: List<GoalEntity>
)

fun GoalsEntity.toGoals() = Goals(
    id = id,
    title = title,
    goals = goals.map { it.toGoal() }
)