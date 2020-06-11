package com.fachreinrachim.domain.usecases

import io.reactivex.Single


/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 08/05/20.
 */
interface SingleUseCase <R> {
    fun execute(): Single<R>
}