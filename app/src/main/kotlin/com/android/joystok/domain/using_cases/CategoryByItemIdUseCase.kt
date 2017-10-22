package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.ItemCategoryAPIModel
import com.android.joystok.domain.repository.ItemRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/21/17.
 */

class CategoryByItemIdUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val itemRepository: ItemRepository
) : UseCase<ItemCategoryAPIModel>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var id: String = ""

    override fun buildUseCaseObservable(): Observable<ItemCategoryAPIModel>? {
        return this.itemRepository.itemCategoryByItemId(auth, id)
    }
}