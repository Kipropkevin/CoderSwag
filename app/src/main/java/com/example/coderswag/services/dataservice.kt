package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object dataservice {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIE", "hoodieimage"),
        Category("HAT", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIE", "hoodieimage"),
        Category("HAT", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIE", "hoodieimage"),
        Category("HAT", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        Product("Kwanusu headshot", "Kshs. 1500", "hat1"),
        Product("Kwanusu king", "Kshs. 1300", "hat2"),
        Product("Kwanusu liverpool", "Kshs. 1500", "hat3"),
        Product("Kwanusu kenya", "Kshs. 1600", "hat4")
    )
    val hoodies = listOf(
        Product("Kwanusu liverpool", "Kshs. 2500", "hoodie1"),
        Product("Kwanusu arsenal", "Kshs. 2500", "hoodie2"),
        Product("Kwanusu chelsea", "Kshs. 2500", "hoodie3"),
        Product("Kwanusu everton", "Kshs. 2500", "hoodie4")
    )
    val shirts = listOf(
        Product("kwanusu LFChome", "Kshs. 1500", "shirt1"),
        Product("kwanusu LFCaway", "Kshs. 1500", "shirt2"),
        Product("kwanusu LFC3rdkit", "Kshs. 1500", "shirt3"),
        Product("kwanusu LFCbaby", "Kshs. 1500", "shirt4")
    )

    val digitalgoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalgoods
        }
    }




}