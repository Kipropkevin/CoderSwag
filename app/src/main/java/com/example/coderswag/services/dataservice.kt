package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object dataservice {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIE", "hoodieimage"),
        Category("HAT", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        Product("Kwanusu headshot", "Kshs. 1500", "hat01"),
        Product("Kwanusu king", "Kshs. 1300", "hat02"),
        Product("Kwanusu liverpool", "Kshs. 1500", "hat03"),
        Product("Kwanusu kenya", "Kshs. 1600", "hat04")
    )
    val hoodies = listOf(
        Product("Kwanusu liverpool", "Kshs. 2500", "hoodie01"),
        Product("Kwanusu arsenal", "Kshs. 2500", "hoodie02"),
        Product("Kwanusu chelsea", "Kshs. 2500", "hoodie03"),
        Product("Kwanusu everton", "Kshs. 2500", "hoodie04")
    )
    val shirts = listOf(
        Product("kwanusu LFChome", "Kshs. 1500", "shirt01"),
        Product("kwanusu LFCaway", "Kshs. 1500", "shirt02"),
        Product("kwanusu LFC3rdkit", "Kshs. 1500", "shirt03"),
        Product("kwanusu LFCbaby", "Kshs. 1500", "shirt04")
    )
}