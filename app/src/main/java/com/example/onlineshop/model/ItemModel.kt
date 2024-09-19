package com.example.onlineshop.model

data class ItemModel(
    val picUrl: ArrayList<String> = ArrayList(),
    val title: String = "",
    val description: String = "",
    val size: ArrayList<String> = ArrayList(),
    val price: Double = 0.0,
    val rating: Double = 0.0,
    val numberInCart: Int = 0)



