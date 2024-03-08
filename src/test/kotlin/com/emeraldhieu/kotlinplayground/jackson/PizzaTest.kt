package com.emeraldhieu.kotlinplayground.jackson

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinFeature
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

private val objectMapper2: ObjectMapper?
    get() {
        val kotlinModule = KotlinModule.Builder()
            .enable(KotlinFeature.StrictNullChecks)
            .build()

        val objectMapper = ObjectMapper()
            .registerModule(kotlinModule)
        return objectMapper
    }

class PizzaTest {

    private var objectMapper = ObjectMapper()

    @BeforeEach
    fun setUp() {
        /*
         * Jackson support for Kotlin
         * See https://github.com/FasterXML/jackson-module-kotlin?tab=readme-ov-file#configuration
         */
        val kotlinModule = KotlinModule.Builder()
            .enable(KotlinFeature.StrictNullChecks)
            .build()
        objectMapper.registerModule(kotlinModule)
    }

    @Test
    fun test() {
        // GIVEN
        val pizza = Pizza(
            name = "pepperoni",
            price = 42.0
        )

        // WHEN
        val json = objectMapper.writeValueAsString(pizza)
        println(json)
        val deserializedPizza = objectMapper.readValue(json, Pizza::class.java)

        // THEN
        assertThat(deserializedPizza.name).isEqualTo(deserializedPizza.name)
        assertThat(deserializedPizza.price).isEqualTo(deserializedPizza.price)
    }
}