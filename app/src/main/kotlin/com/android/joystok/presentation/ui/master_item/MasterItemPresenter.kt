package com.android.joystok.presentation.ui.master_item

import android.util.Log
import com.android.joystok.data.cache.DBHelper
import com.android.joystok.domain.model.ItemAPIModel
import com.android.joystok.domain.using_cases.ListItemUseCase
import com.android.joystok.presentation.internal.di.scope.PerActivity
import org.json.JSONObject
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 10/8/17.
 */

@PerActivity
class MasterItemPresenter
@Inject
constructor(private val listItemUseCase: ListItemUseCase) {
    private val TAG = "MasterCategoryPresenter"

    var view: MasterItemView? = null

    fun onGetList(data: JSONObject) {
        listItemUseCase.auth = DBHelper().getToken()
        listItemUseCase.filter = data
        listItemUseCase.execute(useCaseSubscriber = FunctionSubscriber<List<ItemAPIModel>>()
                .onNext {
                    view?.showListItem(it)
                }
                .onError {
                    Log.e(TAG, "onGetUser: error")
                }
        )
    }
}