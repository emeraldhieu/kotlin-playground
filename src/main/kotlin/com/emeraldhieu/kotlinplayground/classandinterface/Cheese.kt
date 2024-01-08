package com.emeraldhieu.kotlinplayground.classandinterface

class Cheese : Ingredient {

    override val name: String
        get() {
            return "cheese"
        }
    override val price: Double
        get() {
            return 42.0
        }
}