package br.com.joaobosco.appfootball.data.remote;

import java.util.List;

import br.com.joaobosco.appfootball.model.Match;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by João Bosco on 11/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
public interface MatchesApi {
    @GET("matches.json")
    Call<List<Match>> getMatches();
}
