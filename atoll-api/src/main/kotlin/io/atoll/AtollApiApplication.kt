package io.atoll

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AtollApiApplication

fun main(args: Array<String>) {
    runApplication<AtollApiApplication>(*args)
}
