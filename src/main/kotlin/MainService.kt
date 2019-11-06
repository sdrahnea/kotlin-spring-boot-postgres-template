import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.sdrahnea.app")
class MainService

fun main(args: Array<String>) {
    SpringApplication.run(MainService::class.java, *args)
}
