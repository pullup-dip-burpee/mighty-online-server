package com.mightyonline.mightyonlineserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class MightyOnlineServerApplication

fun main(args: Array<String>) {
	runApplication<MightyOnlineServerApplication>(*args)
}
