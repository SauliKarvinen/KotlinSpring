package spring.testiprojekti.SpringKotlinTesti

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinTestiApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinTestiApplication>(*args)


	fun sayhello(): String {
		return "MAIN"
	}

	val hello = sayhello()

	println(hello)
}
