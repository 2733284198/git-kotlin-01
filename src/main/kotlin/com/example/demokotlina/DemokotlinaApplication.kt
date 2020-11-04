package com.example.demokotlina

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@SpringBootApplication
class DemokotlinaApplication

fun main(args: Array<String>) {
    runApplication<DemokotlinaApplication>(*args)
}

@RestController
class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
//        Greeting(counter.incrementAndGet(), "Hello, $name");
        return counter.incrementAndGet().toString();
    }
}