package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.repository.ItemCategoryRepository
import org.json.JSONObject
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

class FindCategoryUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val itemCategoryRepository: ItemCategoryRepository
) : UseCase<List<ItemCategoryAPIModel>>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var categoryName = JSONObject()

    override fun buildUseCaseObservable(): Observable<List<ItemCategoryAPIModel>>? {
        return this.itemCategoryRepository.findCategoryName(auth, categoryName)
    }
}