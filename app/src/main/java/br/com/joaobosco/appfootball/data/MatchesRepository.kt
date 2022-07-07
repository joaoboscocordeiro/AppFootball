package br.com.joaobosco.appfootball.data

import br.com.joaobosco.appfootball.data.remote.MatchesAPI

/**
 * Created by João Bosco on 07/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class MatchesRepository(
    private val api: MatchesAPI
) {

    // Remote
    suspend fun getMatches() = api.getMatches()
    
}