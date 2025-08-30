package oliveira.alberto.mylifemanager.data.models

import oliveira.alberto.mylifemanager.data.enums.GoalType

data class Goal(
    val id: Long = 0,
    val title: String,
    val description: String,
    val type: GoalType,
    val active: Boolean,
    val progress: Int,
    val completed: Boolean,
)
