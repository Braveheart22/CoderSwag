package com.example.john.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.john.coderswag.Adapters.ProductsAdapter
import com.example.john.coderswag.R
import com.example.john.coderswag.Services.DataService
import com.example.john.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this, 2)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}
