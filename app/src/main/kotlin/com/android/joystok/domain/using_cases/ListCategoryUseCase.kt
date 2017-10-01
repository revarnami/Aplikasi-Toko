package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.repository.ItemCategoryRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/27/17.
 */

class ListCategoryUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val itemCategoryRepository: ItemCategoryRepository
) : UseCase<List<ItemCategoryAPIModel>>(threadExecutor, postExecutionThread)
{
    var auth: String = ""

    override fun buildUseCaseObservable(): Observable<List<ItemCategoryAPIModel>>? {
        return this.itemCategoryRepository.itemCategoryList(auth)
    }
}