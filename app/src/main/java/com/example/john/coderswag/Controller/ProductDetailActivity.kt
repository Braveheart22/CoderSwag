package com.example.john.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.john.coderswag.Model.Product
import com.example.john.coderswag.R
import com.example.john.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val context = itemImage.context
        val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)

        itemImage.setImageResource(resourceId)
        productText.text = product.title
        priceText.text = product.price
        descriptionText.text = product.description
    }

    fun addToCart (view: View) {
        println("Item has been added to cart.")
    }
}
