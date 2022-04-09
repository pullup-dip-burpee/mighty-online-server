package com.mightyonline.mightyonlineserver.service

import com.mightyonline.mightyonlineserver.controller.to.CatTO
import org.springframework.stereotype.Service

@Service
class CatService(

) {

    fun getCats() : List<CatTO> {
        val oneCat = CatTO(
            name = "cota",
            age = 5,
        )

        return listOf(oneCat)
    }
}