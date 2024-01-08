package com.emeraldhieu.kotlinplayground.classandinterface

abstract class AbstractPizza : Pizza {

    override val ingredients: List<Ingredient>
        get() {
            return listOf(Cheese())
        }

    override fun bake() {
        println("Put it into an oven")
    }

    override val price: Double
        get() = 42.0
}