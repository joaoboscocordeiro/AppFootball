package br.com.joaobosco.appfootball.domain

import com.google.gson.annotations.SerializedName

/**
 * Created by João Bosco on 06/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
data class Match(
    @SerializedName("descricao")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val awayTeam: Team
)
