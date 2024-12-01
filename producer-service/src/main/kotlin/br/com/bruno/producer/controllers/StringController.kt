package br.com.bruno.producer.controllers

import br.com.bruno.producer.services.StringService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/produces")
class StringController(private val stringService: StringService) {
    @GetMapping
    fun sendMessage(
                    @RequestParam message: String
    ): ResponseEntity<String>{

        stringService.produce(message)
        return ResponseEntity("Mensagem enviada: $message", HttpStatus.OK)
    }
}