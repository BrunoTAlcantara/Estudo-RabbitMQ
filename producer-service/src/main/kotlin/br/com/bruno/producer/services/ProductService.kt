package br.com.bruno.producer.services

import br.com.bruno.producer.configs.RabbitMQConfig
import br.com.bruno.producer.dtos.ProductDto
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import org.springframework.amqp.rabbit.core.RabbitTemplate

@Service
class ProductService(private val rabbitTemplate: RabbitTemplate) {
    fun createProduct(dto:ProductDto){
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY,dto)
    }
}