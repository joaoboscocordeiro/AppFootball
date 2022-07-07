package br.com.joaobosco.appfootball.data

import br.com.joaobosco.appfootball.data.remote.RetrofitInstance

/**
 * Created by João Bosco on 07/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class MatchDataSource {

    private var matchesRepository: MatchesRepository = MatchesRepository(RetrofitInstance.api)

}