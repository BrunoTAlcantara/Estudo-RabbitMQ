package br.com.bruno.producer.dtos

import java.io.Serializable

data class ProductDto(
        val id: Long,
        val name: String
) : Serializable