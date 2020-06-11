package com.fachreinrachim.cleanarchitecture.features

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fachreinrachim.cleanarchitecture.rx.SchedulersProvider
import com.fachreinrachim.domain.entities.ShareDetails
import com.fachreinrachim.domain.usecases.GetShareDetailsUseCase
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * @author M.Fachrein Rachim <fachreinrachim@gmail.com>
 * @since 09/05/20.
 */
class MainViewModel @Inject constructor(
    val shareUseCase: GetShareDetailsUseCase,
    val schedulers: SchedulersProvider
) : ViewModel() {

    val shareLiveData = MutableLiveData<ShareDetails>()
    protected val compositeDisposable = CompositeDisposable()

    fun getShareData() {
        shareUseCase.execute()
            .subscribeOn(schedulers.io())
            .subscribe({
                it?.let {
                    shareLiveData.postValue(it)
                }
            },{

            }).let {
                compositeDisposable.add(it)
            }
    }

    override fun onCleared() {
        compositeDisposable.clear()
    }

}