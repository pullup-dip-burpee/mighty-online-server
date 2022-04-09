package com.mightyonline.mightyonlineserver.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    @GetMapping("/alive")
    fun healthCheck() : String{
        return "alive"
    }
}
