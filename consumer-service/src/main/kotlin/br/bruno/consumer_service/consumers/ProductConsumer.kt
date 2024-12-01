package br.bruno.consumer_service.consumers

import br.bruno.consumer_service.dtos.ProductDto
import lombok.extern.log4j.Log4j2
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component
import kotlin.math.log
@Log4j2
@Component
class ProductConsumer {
    @RabbitListener(queues = ["product.log"])
    fun consumer(message: ProductDto) {
        println("Consumer reaceived a message" + message.toString())
    }
}