package br.com.joaobosco.appfootball.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * Created by João Bosco on 06/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
@Parcelize
data class Place(
    @SerializedName("nome")
    val name: String,
    @SerializedName("imagem")
    val image: String
) : Parcelable