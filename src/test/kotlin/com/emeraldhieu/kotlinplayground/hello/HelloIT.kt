package com.emeraldhieu.kotlinplayground.hello

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("test")
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = [HelloConfiguration::class]
)
class HelloIT {

    @LocalServerPort
    private var port: Int = 0

    @BeforeEach
    fun setUp() {
    }

    @Test
    fun test() {
        println("Port: $port")

        while (true) {
        }
    }
}