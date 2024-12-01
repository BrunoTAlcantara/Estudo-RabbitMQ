package br.com.bruno.producer.controllers

import br.com.bruno.producer.dtos.ProductDto
import br.com.bruno.producer.services.ProductService
import br.com.bruno.producer.services.StringService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(private val productService: ProductService) {
    @PostMapping
    fun sendMessage(
                    @RequestBody dto: ProductDto
    ): ResponseEntity<String>{

        productService.createProduct(dto)
        return ResponseEntity.status(201).build()
    }
}