package br.com.joaobosco.appfootball.ui

import androidx.lifecycle.ViewModelProvider
import br.com.joaobosco.appfootball.data.MatchesRepository

/**
 * Created by João Bosco on 07/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class ViewModelFactory(
    private val repository: MatchesRepository
) : ViewModelProvider.NewInstanceFactory() {

//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return when {
//            modelClass.isAssignableFrom(MatchViewModel::class.java) -> MatchViewModel(repository) as T
//            else -> throw IllegalArgumentException("ViewModel não encontrado.")
//        }
//    }

}