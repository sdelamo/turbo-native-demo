package io.micronaut.turbo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("io.micronaut")
		.start()
}

