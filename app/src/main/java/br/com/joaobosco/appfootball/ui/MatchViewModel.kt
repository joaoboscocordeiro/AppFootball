package br.com.joaobosco.appfootball.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import br.com.joaobosco.appfootball.data.MatchesRepository
import br.com.joaobosco.appfootball.domain.Match
import br.com.joaobosco.appfootball.util.StateResource
import retrofit2.Response

/**
 * Created by João Bosco on 07/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class MatchViewModel constructor(
    private val repository: MatchesRepository
) {

    private val _getAllMatches = MutableLiveData<Match>()
    val getAllMatches: LiveData<Match> get() = _getAllMatches

    init {
        safeFetchAll()
    }

    private fun safeFetchAll() = viewModelScope.launch {

    }

    private fun handleResponse(response: Response<List<Match>>): StateResource<List<Match>> {
        if (response.isSuccessful) {
            response.body()?.let { values ->
                return StateResource.Success(values)
            }
        }
        return StateResource.Error(response.message())
    }

}