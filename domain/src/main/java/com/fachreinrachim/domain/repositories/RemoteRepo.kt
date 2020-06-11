package com.fachreinrachim.domain.repositories

import com.fachreinrachim.domain.entities.ShareDetails
import io.reactivex.Single

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
interface RemoteRepo {
    fun getShareDetails(): Single<ShareDetails>
}