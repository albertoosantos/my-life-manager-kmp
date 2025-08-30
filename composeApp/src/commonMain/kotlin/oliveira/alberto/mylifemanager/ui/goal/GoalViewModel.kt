package oliveira.alberto.mylifemanager.ui.goal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import oliveira.alberto.mylifemanager.data.models.Goals
import oliveira.alberto.mylifemanager.domain.usecases.GetAllGoalsUseCase

class GoalViewModel(
    private val getGoalsUseCase: GetAllGoalsUseCase,
) : ViewModel() {
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