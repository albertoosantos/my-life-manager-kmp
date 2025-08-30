package oliveira.alberto.mylifemanager.domain.usecases

import oliveira.alberto.mylifemanager.data.repositories.goals.GoalsRepository

public class GetAllGoalsUseCase(private val repository: GoalsRepository) {
    suspend operator fun invoke() = repository.getAllGoals()
}