package br.bruno.consumer_service.consumers

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component
import kotlin.math.log

@Component
class StringConsumer {
    @RabbitListener(queues = ["product.log"])
    fun consumer(message: String) {
        println("Consumer reaceived a message" + message)
    }
}