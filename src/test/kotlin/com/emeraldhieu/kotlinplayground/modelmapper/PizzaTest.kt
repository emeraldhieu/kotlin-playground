package com.emeraldhieu.kotlinplayground.modelmapper

import Ingredient
import Pizza
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDate

class PizzaTest {

    @Test
    fun whenCreate_thenValuesAreEquals() {
        // WHEN
        val pizzaName = "pepperoni"
        val ingredientName = "cheese"
        val ingredientPrice = 42.0
        val ingredientExpiryDate = LocalDate.of(2024, 1, 1)
        val pizza = Pizza(
            name = pizzaName,
            ingredient = Ingredient(
                name = ingredientName,
                price = ingredientPrice,
                expiryDate = ingredientExpiryDate
            )
        )

        // THEN
        assertEquals(pizzaName, pizza.name)
        assertEquals(ingredientName, pizza.ingredient.name)
        assertEquals(ingredientPrice, pizza.ingredient.price)
        assertEquals(ingredientExpiryDate, pizza.ingredient.expiryDate)
    }
}