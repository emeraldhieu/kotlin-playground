package com.emeraldhieu.kotlinplayground.hello

import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@ImportAutoConfiguration(
    ServletWebServerFactoryAutoConfiguration::class,
    WebMvcAutoConfiguration::class
)
@Import(
    value = [
        HelloController::class
    ]
)
class HelloConfiguration {
}

