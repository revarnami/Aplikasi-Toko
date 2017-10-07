package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.repository.ItemCategoryRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/30/17.
 */

class AddCategoryUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val itemCategoryRepository: ItemCategoryRepository
) : UseCase<ItemCategoryAPIModel>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var categoryName: String = ""
    var remarks: String = ""

    override fun buildUseCaseObservable(): Observable<ItemCategoryAPIModel>? {
        return this.itemCategoryRepository.addCategory(auth, categoryName, remarks)
    }
}