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

    private val hats = listOf(
            Product ("Devslopes Graphic Beenie", "$18.00", "hat1", "Structured Twill Cap"),
            Product ("Devslopes Hat Black", "$20.00", "hat2", "Structured Twill Cap"),
            Product ("Devslopes Hat White", "$18.00", "hat3", "Structured Twill Cap"),
            Product ("Devslopes Hat Snapback", "$22.00", "hat4", "Structured Twill Cap")
    )

    private val hoodies = listOf(
            Product ("Devslopes Hoodie Gray", "$28.00", "hoodie1", "A sporty hoodie with a soft inside. The iconic zip hoodie you see Silicon Valley big shots wearing - the understated yet classic look, giving... "),
            Product ("Devslopes Hoodie Red", "$32.00", "hoodie2", "A sporty hoodie with a soft inside. The iconic zip hoodie you see Silicon Valley big shots wearing - the understated yet classic look, giving... "),
            Product ("Devslopes Red Hoodie", "$28.00", "hoodie3", "A sporty hoodie with a soft inside. The iconic zip hoodie you see Silicon Valley big shots wearing - the understated yet classic look, giving... "),
            Product ("Devslopes Black Hoodie", "$28.00", "hoodie4", "A sporty hoodie with a soft inside. The iconic zip hoodie you see Silicon Valley big shots wearing - the understated yet classic look, giving... ")
    )

    private val shirts = listOf(
            Product ("Devslopes Shirt Gray", "$18.00", "shirt1", "Made of fine jersey, it has a durable, vintage feel. These classic-cut shirts are known for their premium quality, as well as ability to stand... "),
            Product ("Devslopes Badge Light Gray", "$20.00", "shirt2", "Made of fine jersey, it has a durable, vintage feel. These classic-cut shirts are known for their premium quality, as well as ability to stand... "),
            Product ("Devslopes Logo Shirt Red", "$22.00", "shirt3", "Made of fine jersey, it has a durable, vintage feel. These classic-cut shirts are known for their premium quality, as well as ability to stand... "),
            Product ("Devslopes Hustle", "$22.00", "shirt4", "Made of fine jersey, it has a durable, vintage feel. These classic-cut shirts are known for their premium quality, as well as ability to stand... "),
            Product ("Devslopes Kickflip Studios", "$18.00", "shirt5", "Made of fine jersey, it has a durable, vintage feel. These classic-cut shirts are known for their premium quality, as well as ability to stand... ")
    )

    private val digitalGoods = listOf<Product>()

    fun getProducts (category: String) : List<Product>{

        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}