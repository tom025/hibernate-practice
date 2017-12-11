package me.tom025.hibernate

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class HibernateApplication

fun main(args: Array<String>) {
    SpringApplication.run(
            HibernateApplication::class.java,
            *args
    )
}
