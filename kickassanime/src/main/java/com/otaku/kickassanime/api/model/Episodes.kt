package com.otaku.kickassanime.api.model

import com.google.gson.annotations.SerializedName

data class Episodes (
    @SerializedName("epnum") val epnum: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("slug") val slug: String? = null,
    @SerializedName("createddate") val createddate: String? = null,
    @SerializedName("num") val num: String? = null
)