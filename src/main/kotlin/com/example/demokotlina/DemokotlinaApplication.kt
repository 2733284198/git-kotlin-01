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

data class SpaceCraft(val id:Int = 1, val name: String = "name1")

@RestController
class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): SpaceCraft {
//        Greeting(counter.incrementAndGet(), "Hello, $name");
//        return counter.incrementAndGet().toString();
        return SpaceCraft(11, "manlan1");
    }
}