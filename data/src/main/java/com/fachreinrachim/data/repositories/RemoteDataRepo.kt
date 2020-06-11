package com.fachreinrachim.data.repositories

import com.fachreinrachim.data.apiservice.ApiService
import com.fachreinrachim.data.mappers.ShareMapper
import com.fachreinrachim.data.models.ShareDataModel
import com.fachreinrachim.domain.entities.ShareDetails
import com.fachreinrachim.domain.repositories.RemoteRepo
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
class RemoteDataRepo @Inject constructor(
    private val apiService: ApiService,
    private val shareMapper: dagger.Lazy<ShareMapper>) : RemoteRepo {

    override fun getShareDetails(): Single<ShareDetails> {
        return  apiService.getSharingDetails()
            .map {
                shareMapper.get().toShareDetails(it)
            }
    }
}