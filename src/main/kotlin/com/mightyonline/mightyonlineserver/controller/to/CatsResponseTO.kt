package com.mightyonline.mightyonlineserver.controller.to

data class CatsResponseTO(
    val cats: List<CatTO> = listOf(),
)

data class CatTO(
    val name: String? = null,
    val age: Int? = null,
)