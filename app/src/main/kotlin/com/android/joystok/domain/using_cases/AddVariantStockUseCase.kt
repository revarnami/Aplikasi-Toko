package com.android.joystok.domain.using_cases

import com.android.joystok.domain.executor.PostExecutionThread
import com.android.joystok.domain.executor.ThreadExecutor
import com.android.joystok.domain.model.VariantStockAPIModel
import com.android.joystok.domain.repository.VariantStockRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/14/17.
 */

class AddVariantStockUseCase
@Inject
constructor(threadExecutor: ThreadExecutor,
            postExecutionThread: PostExecutionThread,
            private val variantStock: VariantStockRepository
) : UseCase<VariantStockAPIModel>(threadExecutor, postExecutionThread)
{
    var auth: String = ""
    var itemVariantId: Int = 0
    var quantity: Int = 0
    var branchId: Int = 0

    override fun buildUseCaseObservable(): Observable<VariantStockAPIModel>? {
            return this.variantStock.addVariantStock(auth, itemVariantId, quantity, branchId)
    }
}