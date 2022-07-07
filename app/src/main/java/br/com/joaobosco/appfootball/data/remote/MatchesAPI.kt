package br.com.joaobosco.appfootball.data.remote

import br.com.joaobosco.appfootball.domain.Match
import retrofit2.http.GET

/**
 * Created by João Bosco on 07/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
interface MatchesAPI {

    @GET("matches.json")
    suspend fun getMatches(): List<Match>
}