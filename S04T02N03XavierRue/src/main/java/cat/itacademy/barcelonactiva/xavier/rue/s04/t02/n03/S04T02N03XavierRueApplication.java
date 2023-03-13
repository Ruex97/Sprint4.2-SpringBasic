package cat.itacademy.barcelonactiva.xavier.rue.s04.t02.n03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "cat.itacademy.barcelonactiva.xavier.rue.s04.t02.n03.model.repository")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class S04T02N03XavierRueApplication {
	public static void main(String[] args) {
		SpringApplication.run(S04T02N03XavierRueApplication.class, args);
	}
}



