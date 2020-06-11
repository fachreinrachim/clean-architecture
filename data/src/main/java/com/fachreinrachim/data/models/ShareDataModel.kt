package com.fachreinrachim.data.models

import com.google.gson.annotations.SerializedName

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
data class ShareDataModel (
    @SerializedName("status_code")
    val statusCode: Int = -1,
    @SerializedName("message")
    val shareMessage: String? = null,
    @SerializedName("source")
    val source: String? = null,
    @SerializedName("share_url")
    val shareUrl: String? = null,
    @SerializedName("campaign")
    val campaign: String? = null,
    @SerializedName("user_id")
    val userdId: String? = null
)