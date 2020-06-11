package com.fachreinrachim.data.mappers

import com.fachreinrachim.data.models.ShareDataModel
import com.fachreinrachim.domain.entities.ShareDetails
import javax.inject.Inject

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
class ShareMapper @Inject constructor() {

    fun toShareDetails(shareModelServer: ShareDataModel): ShareDetails {
        return ShareDetails(
            shareModelServer.shareMessage ?: "",
            shareModelServer.shareUrl ?: "",
            shareModelServer.source ?: ""
        )
    }
}