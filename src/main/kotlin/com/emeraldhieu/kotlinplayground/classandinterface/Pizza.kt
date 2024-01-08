package com.emeraldhieu.kotlinplayground.classandinterface

interface Pizza {
    val name: String
    val ingredients: List<Ingredient>
    val price: Double
    fun bake()
}