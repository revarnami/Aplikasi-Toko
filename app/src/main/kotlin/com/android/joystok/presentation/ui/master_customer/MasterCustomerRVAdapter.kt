package com.android.joystok.presentation.ui.master_customer

import android.app.Activity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.joystok.R
import com.android.joystok.domain.model.CustomerAPIModel
import com.android.joystok.presentation.navigation.navigateToCustomerDetail
import kotlinx.android.synthetic.main.item_master_customer.view.*

/**
 * Created by Fauzi Arnami on 10/7/17.
 */

class MasterCustomerRVAdapter (private val activity: Activity,
                               private val customerList: List<CustomerAPIModel>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    private val TAG = "TopicMainRVAdapter"

    private var layoutInflater: LayoutInflater
//    internal var scrollDist = 0
//    internal var isVisible = true
//    private val visibleThreshold = 4
//    private var lastVisibleItem: Int = 0
//    private var totalItemCount:Int = 0
//    private var loading: Boolean = false
//    private var onLoadMoreListener: OnLoadMoreListener? = null

    init {
        layoutInflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        if (recyclerView.layoutManager is LinearLayoutManager) {
//            val linearLayoutManager = recyclerView
//                    .layoutManager as LinearLayoutManager
//            recyclerView
//                    .addOnScrollListener(object : RecyclerView.OnScrollListener() {
//                        override fun onScrolled(recyclerView: RecyclerView?,
//                                                dx: Int, dy: Int) {
//                            super.onScrolled(recyclerView, dx, dy)
//                            if (isVisible && dy > 0 || !isVisible && dy < 0) {
//                                scrollDist += dy
//                            }
//
//                            totalItemCount = linearLayoutManager.itemCount
//                            lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition()
//
//                            if (!loading && totalItemCount <= lastVisibleItem + visibleThreshold) {
//                                // End has been reached
//                                if (onLoadMoreListener != null) {
//                                    onLoadMoreListener!!.onLoadMore()
//                                }
//                                loading = true
//                            }
//                        }
//                    })
//        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val view = holder.itemView
        view.customerNameTV.text = customerList[position].name
        view.setOnClickListener {
            val customerId = customerList[position].id
            val customerName = customerList[position].name
            val customerPhone = customerList[position].phone
            val customerAddress = customerList[position].address
            val customerRemarks = customerList[position].remarks
            navigateToCustomerDetail(
                    activity,
                    customerId,
                    customerName,
                    customerPhone,
                    customerAddress,
                    customerRemarks
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val view = layoutInflater.inflate(R.layout.item_master_customer, parent, false)
        val mvh = TopicViewHolder(view)
        return mvh
    }

    override fun getItemCount(): Int {
        return customerList.size
    }

//    fun setLoaded() {
//        loading = false
//    }

//    fun setOnLoadMoreListener(onLoadMoreListener: OnLoadMoreListener) {
//        this.onLoadMoreListener = onLoadMoreListener
//    }

    class TopicViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView)
}