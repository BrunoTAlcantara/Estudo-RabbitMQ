package br.bruno.consumer_service.dtos

import java.io.Serializable

data class ProductDto(
        val id: Long,
        val name: String
):Serializable
