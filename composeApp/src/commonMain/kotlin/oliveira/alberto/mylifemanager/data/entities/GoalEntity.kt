package oliveira.alberto.mylifemanager.data.entities

import androidx.room.PrimaryKey
import oliveira.alberto.mylifemanager.data.enums.GoalType
import oliveira.alberto.mylifemanager.data.models.Goal

data class GoalEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val description: String,
    val type: GoalType,
    val active: Boolean,
    val progress: Int,
    val completed: Boolean,
    val goalsId: Long
)

fun GoalEntity.toGoal() = Goal(
    id = id,
    title = title,
    description = description,
    type = type,
    active = active,
    progress = progress,
    completed = completed
)