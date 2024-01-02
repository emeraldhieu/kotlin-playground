package com.emeraldhieu.kotlinplayground.modelmapper

import Ingredient
import Pizza
import PizzaDto
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.modelmapper.ModelMapper
import org.modelmapper.config.Configuration
import java.time.LocalDate

class ModelMapperTest {

    @Test
    fun whenCreate_thenValuesAreEquals() {
        // GIVEN
        val pizza = Pizza(
            name = "pepperoni",
            ingredient = Ingredient(
                name = "cheese",
                price = 42.0,
                expiryDate = LocalDate.of(2024, 1, 1)
            )
        )

        val modelMapper = ModelMapper()
        modelMapper.configuration
            .setFieldMatchingEnabled(true)
            .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)

        // WHEN
        val pizzaDto = modelMapper.map(
            pizza,
            PizzaDto::class.java
        )

        // THEN

        // THEN
        assertEquals(pizza.name, pizzaDto.name)
        assertEquals(pizza.ingredient.name, pizzaDto.ingredient.name)
        assertEquals(pizza.ingredient.price, pizzaDto.ingredient.price)

        // Can't map #expiryDate to #expirationDate because ReferenceMapExpression#map requires DestinationSetter that requires a setter.
        //assertEquals(pizza.ingredient.expiryDate, pizzaDto.ingredient.expirationDate)
    }
}