package br.com.bruno.producer.services

import br.com.bruno.producer.configs.RabbitMQConfig
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import org.springframework.amqp.rabbit.core.RabbitTemplate

@Service
class StringService(private val rabbitTemplate: RabbitTemplate) {
    fun produce(message: String){
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY, message)
    }
}