package br.com.bruno.producer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProducerServiceApplication

fun main(args: Array<String>) {
	runApplication<ProducerServiceApplication>(*args)
}
