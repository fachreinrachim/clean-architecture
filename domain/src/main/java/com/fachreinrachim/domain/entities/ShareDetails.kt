package com.fachreinrachim.domain.entities

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
data class ShareDetails (
    var shareMessage: String? = null,
    var shareUrl:String ?=null,
    var source: String
)