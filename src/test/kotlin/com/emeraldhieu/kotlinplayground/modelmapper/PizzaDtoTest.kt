package com.emeraldhieu.kotlinplayground.modelmapper

import IngredientDto
import PizzaDto
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDate

class PizzaDtoTest {

    @Test
    fun whenCreate_thenValuesAreEquals() {
        // WHEN
        val pizzaName = "pepperoni"
        val ingredientName = "cheese"
        val ingredientPrice = 42.0
        val ingredientExpiryDate = LocalDate.of(2024, 1, 1)
        val pizza = PizzaDto(
            name = pizzaName,
            ingredient = IngredientDto(
                name = ingredientName,
                price = ingredientPrice,
                expirationDate = ingredientExpiryDate
            )
        )

        // THEN
        assertEquals(pizzaName, pizza.name)
        assertEquals(ingredientName, pizza.ingredient.name)
        assertEquals(ingredientPrice, pizza.ingredient.price)
        assertEquals(ingredientExpiryDate, pizza.ingredient.expirationDate)
    }
}