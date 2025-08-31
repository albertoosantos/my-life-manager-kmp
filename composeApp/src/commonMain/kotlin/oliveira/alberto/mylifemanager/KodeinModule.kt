package oliveira.alberto.mylifemanager

import oliveira.alberto.mylifemanager.data.database.AppDatabase
import oliveira.alberto.mylifemanager.data.repositories.goals.GoalsRepository
import oliveira.alberto.mylifemanager.data.repositories.goals.GoalsRepositoryImpl
import oliveira.alberto.mylifemanager.domain.usecases.GetAllGoalsUseCase
import oliveira.alberto.mylifemanager.ui.goal.list.GoalViewModel
import org.kodein.di.DI
import org.kodein.di.bindProvider
import org.kodein.di.instance

expect fun platformModule(): DI.Module

val databaseDI = DI.Module {
    import(platformModule())

    bindProvider {
        GoalViewModel(getGoalsUseCase = instance())
    }

    bindProvider {
        GetAllGoalsUseCase(repository = instance())
    }

    bindProvider<GoalsRepository> {
        GoalsRepositoryImpl(goalsDao = instance<AppDatabase>().getGoalsDao())
    }
}
