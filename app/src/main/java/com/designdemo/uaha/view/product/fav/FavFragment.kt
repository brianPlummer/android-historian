package com.designdemo.uaha.view.product.fav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.designdemo.uaha.data.model.product.ProductEntity
import com.support.android.designlibdemo.R
import kotlinx.android.synthetic.main.fragment_prod_list.product_recyclerview
import kotlinx.android.synthetic.main.fragment_prod_list.view.product_recyclerview
import kotlinx.android.synthetic.main.fragment_prod_list.view.product_nodata_text
import kotlinx.android.synthetic.main.fragment_prod_list.view.product_nodata_layout
import kotlinx.android.synthetic.main.fragment_prod_list.view.product_nodata_img

class FavFragment : Fragment() {

    private var mainActivity: FragmentActivity? = null

    private lateinit var favViewModelImpl: FavViewModelImpl

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val mainView = inflater.inflate(R.layout.fragment_prod_list, container, false)

        val rv = mainView.product_recyclerview
        val noText = mainView.product_nodata_text
        val noLayout = mainView.product_nodata_layout
        val noTextImg = mainView.product_nodata_img

        mainActivity = activity

        favViewModelImpl = ViewModelProviders.of(this).get(FavViewModelImpl::class.java)
        favViewModelImpl.getFavData().observe(this, Observer { favList ->
            if (favList.isNotEmpty()) {
                setupRecyclerView(rv, favList)
                product_recyclerview.setVisibility(View.VISIBLE)
                noLayout.setVisibility(View.GONE)
            } else {
                noText.setText(getString(R.string.add_fav_text))
                noTextImg.setVisibility(View.VISIBLE)
                noLayout.setVisibility(View.VISIBLE)
                product_recyclerview.setVisibility(View.GONE)
            }
        })

        return mainView
    }

    private fun setupRecyclerView(recyclerView: RecyclerView, devList: List<ProductEntity>) {
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.adapter = FavTypeAdapter(mainActivity!!, favViewModelImpl.getFavData().value!!)
    }
}
