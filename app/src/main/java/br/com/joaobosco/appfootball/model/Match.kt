package br.com.joaobosco.appfootball.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * Created by João Bosco on 06/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
@Parcelize
data class Match(
    @SerializedName("descricao")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val awayTeam: Team
) : Parcelable
