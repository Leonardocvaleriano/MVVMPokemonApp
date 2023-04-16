package com.codeplace.mvvmpokemonapp.ui.home.view.models

import org.json.JSONObject
import java.io.Serializable

data class Sprites (
    val front_default:String): Serializable {
    constructor(jsonObject: JSONObject):this(
        jsonObject.getString("front_default")
    )
}
