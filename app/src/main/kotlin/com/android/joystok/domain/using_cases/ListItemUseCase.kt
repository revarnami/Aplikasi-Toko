package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.repository.ItemRepository
import org.json.JSONObject
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

class ListItemUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val itemRepository: ItemRepository
) : UseCase<List<ItemAPIModel>>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var filter: JSONObject = JSONObject()

    override fun buildUseCaseObservable(): Observable<List<ItemAPIModel>>? {
        return this.itemRepository.itemList(auth, filter)
    }
}