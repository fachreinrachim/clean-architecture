package com.fachreinrachim.domain.usecases

import com.fachreinrachim.domain.entities.ShareDetails
import com.fachreinrachim.domain.repositories.RemoteRepo
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
class GetShareDetailsUseCase @Inject constructor(val apiRepo: RemoteRepo):
    SingleUseCase<ShareDetails> {

    override fun execute(): Single<ShareDetails> {
        return apiRepo.getShareDetails()
    }
}