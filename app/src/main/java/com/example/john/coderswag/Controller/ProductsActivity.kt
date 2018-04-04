package com.example.john.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.john.coderswag.Adapters.ProductsAdapter
import com.example.john.coderswag.R
import com.example.john.coderswag.Services.DataService
import com.example.john.coderswag.Utilities.EXTRA_CATEGORY
import com.example.john.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    private lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        this.adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) { Product ->
            println("Clicked on a product...")
            val detailIntent = Intent (this, ProductDetailActivity::class.java)
            detailIntent.putExtra(EXTRA_PRODUCT, Product)
            startActivity(detailIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}