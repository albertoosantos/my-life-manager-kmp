package oliveira.alberto.mylifemanager.ui.goal.list

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import oliveira.alberto.mylifemanager.data.models.Goals
import oliveira.alberto.mylifemanager.domain.usecases.GetAllGoalsUseCase

class GoalViewModel(
    private val dispatcher: CoroutineDispatcher = Dispatchers.Main,
    private val getGoalsUseCase: GetAllGoalsUseCase,
) {
    private val viewModelScope = CoroutineScope(dispatcher)

    private val _goals = MutableStateFlow<List<Goals>>(emptyList())
    val goals: Flow<List<Goals>> = _goals

    init {
        viewModelScope.launch {
            getGoalsUseCase().collect {
                _goals.value = it
            }
        }
    }
}