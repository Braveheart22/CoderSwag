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
            Product ("Devslopes Graphic Beenie", "$18.00", "hat01"),
            Product ("Devslopes Hat Black", "$20.00", "hat02"),
            Product ("Devslopes Hat White", "$18.00", "hat03"),
            Product ("Devslopes Hat Snapback", "$22.00", "hat04")
    )

    val hoodies = listOf(
            Product ("Devslopes Hoodie Gray", "$28.00", "hoodie01"),
            Product ("Devslopes Hoodie Red", "$32.00", "hoodie02"),
            Product ("Devslopes Red Hoodie", "$28.00", "hoodie03"),
            Product ("Devslopes Black Hoodie", "$28.00", "hoodie04")
    )

    val shirts = listOf(
            Product ("Devslopes Shirt Gray", "$18.00", "shirt01"),
            Product ("Devslopes Badge Light Gray", "$20.00", "shirt02"),
            Product ("Devslopes Logo Shirt Red", "$22.00", "shirt03"),
            Product ("Devslopes Hustle", "$22.00", "shirt04"),
            Product ("Devslopes Kickflip Studios", "$18.00", "shirt05")
    )
}