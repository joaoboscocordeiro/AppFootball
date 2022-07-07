package br.com.joaobosco.appfootball.domain

import com.google.gson.annotations.SerializedName

/**
 * Created by João Bosco on 06/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
data class Place(
    @SerializedName("nome")
    val name: String,
    @SerializedName("imagem")
    val image: String
)