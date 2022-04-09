package com.mightyonline.mightyonlineserver.controller

import com.mightyonline.mightyonlineserver.controller.to.AliveTO
import com.mightyonline.mightyonlineserver.controller.to.CatsResponseTO
import com.mightyonline.mightyonlineserver.service.CatService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController(
    private val catService: CatService,
) {

    @GetMapping("/alive")
    fun healthCheck() : String{
        return "alive"
    }

    @GetMapping("/alive/json")
    fun healthCheckJson() : AliveTO{
        return AliveTO("hello world")
    }

    @GetMapping("/cats")
    fun getCats() : CatsResponseTO {
        return CatsResponseTO(cats = catService.getCats())
    }
}
