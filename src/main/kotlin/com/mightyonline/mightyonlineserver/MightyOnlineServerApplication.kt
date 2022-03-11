package com.mightyonline.mightyonlineserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MightyOnlineServerApplication

fun main(args: Array<String>) {
	runApplication<MightyOnlineServerApplication>(*args)
}
