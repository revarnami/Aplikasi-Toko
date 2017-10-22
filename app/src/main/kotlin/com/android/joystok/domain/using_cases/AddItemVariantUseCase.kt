package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.ItemVariantAPIModel
import com.android.joystok.domain.repository.ItemVariantRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class AddItemVariantUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val itemRepository: ItemVariantRepository
) : UseCase<ItemVariantAPIModel>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var itemId: Int = 0
    var variantName: String = ""

    override fun buildUseCaseObservable(): Observable<ItemVariantAPIModel>? {
        return this.itemRepository.addItemVariant(auth, itemId, variantName)
    }
}