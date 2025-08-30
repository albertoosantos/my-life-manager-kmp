package oliveira.alberto.mylifemanager.data.models

data class Goals(
    val id: Long = 0,
    val title: String,
    val goals: List<Goal>
)
