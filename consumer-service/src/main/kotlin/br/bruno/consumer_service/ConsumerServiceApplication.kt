package br.bruno.consumer_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConsumerServiceApplication

fun main(args: Array<String>) {
	runApplication<ConsumerServiceApplication>(*args)
}
