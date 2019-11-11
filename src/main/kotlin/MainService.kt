import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("com.sdrahnea.app")
@ComponentScan("com.sdrahnea.app")
class MainService

fun main(args: Array<String>) {
    SpringApplication.run(MainService::class.java, *args)
}
