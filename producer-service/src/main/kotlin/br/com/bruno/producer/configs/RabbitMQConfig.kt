package br.com.bruno.producer.configs

import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.DirectExchange
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig {

    companion object {
        const val QUEUE_NAME = "product.log"
        const val EXCHANGE_NAME = "mkplace.direct"
        const val ROUTING_KEY = "product.log"
    }

    @Bean
    fun queue(): Queue {
        return Queue(QUEUE_NAME, true)
    }

    @Bean
    fun exchange(): DirectExchange {
        return DirectExchange(EXCHANGE_NAME, false, false)
    }

    @Bean
    fun binding(queue: Queue, exchange: DirectExchange): Binding {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY)
    }

    @Bean
    fun messageConverter(): Jackson2JsonMessageConverter {
        return Jackson2JsonMessageConverter()
    }

    @Bean
    fun rabbitTemplate(connectionFactory: ConnectionFactory): RabbitTemplate {
        val rabbitTemplate = RabbitTemplate(connectionFactory)
        rabbitTemplate.messageConverter = messageConverter()
        return rabbitTemplate
    }
}
