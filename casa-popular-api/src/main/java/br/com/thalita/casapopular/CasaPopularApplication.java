package br.com.thalita.casapopular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("br.com.thalita")
@EntityScan(basePackages = {"br.com.thalita.casapopular"})
@EnableJpaRepositories(basePackages = {"br.com.thalita.casapopular.**.repository"})
public class CasaPopularApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasaPopularApplication.class, args);
	}

}
