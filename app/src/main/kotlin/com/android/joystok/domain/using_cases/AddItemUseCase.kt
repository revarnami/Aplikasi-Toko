package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.repository.ItemRepository
import com.google.gson.JsonObject
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class AddItemUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val itemRepository: ItemRepository
) : UseCase<ItemAPIModel>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var data: JsonObject = JsonObject()

    override fun buildUseCaseObservable(): Observable<ItemAPIModel>? {
        return this.itemRepository.addItem(auth, data)
    }
}