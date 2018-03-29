package com.example.john.coderswag.Services

import com.example.john.coderswag.Model.Category
import com.example.john.coderswag.Model.Product

/**
 * Created by John on 3/28/2018.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product ("Devslopes Graphic Beenie", "$18.00", "hat1"),
            Product ("Devslopes Hat Black", "$20.00", "hat2"),
            Product ("Devslopes Hat White", "$18.00", "hat3"),
            Product ("Devslopes Hat Snapback", "$22.00", "hat4")
    )

    val hoodies = listOf(
            Product ("Devslopes Hoodie Gray", "$28.00", "hoodie1"),
            Product ("Devslopes Hoodie Red", "$32.00", "hoodie2"),
            Product ("Devslopes Red Hoodie", "$28.00", "hoodie3"),
            Product ("Devslopes Black Hoodie", "$28.00", "hoodie4")
    )

    val shirts = listOf(
            Product ("Devslopes Shirt Gray", "$18.00", "shirt1"),
            Product ("Devslopes Badge Light Gray", "$20.00", "shirt2"),
            Product ("Devslopes Logo Shirt Red", "$22.00", "shirt3"),
            Product ("Devslopes Hustle", "$22.00", "shirt4"),
            Product ("Devslopes Kickflip Studios", "$18.00", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts (category: String) : List<Product>{

        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}