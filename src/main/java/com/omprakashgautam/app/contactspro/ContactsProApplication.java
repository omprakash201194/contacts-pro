package com.omprakashgautam.app.contactspro;

import com.omprakashgautam.app.contactspro.domain.Contact;
import com.omprakashgautam.app.contactspro.enums.Gender;
import com.omprakashgautam.app.contactspro.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

/**
 * The type Contacts pro application.
 */
@SpringBootApplication
@EnableSwagger2
public class ContactsProApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ContactsProApplication.class, args);
	}


	//TODO 1. Setup SQL scripts to add tables - for postgres
	//Add repository layer - done
	//Add entity listeners to automatically update createdOn and updatedOn - done
	//Add Service layer - done
	//Add Rest layer - done
	//Add swagger to document api's - done
	//Configure Logging - logback - done
	//TODO 6.1: Add AOP using annotation to log method time consumption
	//Add hateoas to rest api - done
	//Add global exception handler - done
	//TODO 9: Add unit test cases for each layer
	//TODO 10: Add integration test cases
	//TODO 11: Integrate Liquibase for tracking sql schema changes
	//TODO 12: Add jenkins for CI / CD
	//TODO 13: Add dockerization or kubernetes
	//TODO 14: Add react front end
	//TODO 15: Add android app for the same
	//TODO 16: Add caching - redis
	//TODO 17: Add elastic search for indexing
	//TODO 18: Add spring boot profiles for dev, prod, test


	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.omprakashgautam.app.contactspro.controller"))
				.paths(PathSelectors.any())
				.build()
			.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"Contact Pro Rest API's",
				"Contact Pro Rest API's for operations",
				"v1",
				"Terms of service",
				new springfox.documentation.service.Contact("Omprakash Gautam",
						"www.omprakashgautam.com",
						"omprakash201194@gmail.com"),
				"License of API", "API license URL", Collections.emptyList());
	}

	@Bean
	CommandLineRunner commandLineRunner(ContactRepository contactRepository) {
		return args -> {
			Contact om = Contact.builder()
					.id(1L)
					.firstName("Om")
					.lastName("Gautam")
					.dateOfBirth(LocalDate.of(1994,11,20))
					.location("Mumbai")
					.gender(Gender.MALE)
					.isFavorite(true)
					.build();

			Contact stuart = Contact.builder()
					.id(2L)
					.firstName("Stuart")
					.lastName("Gautam")
					.dateOfBirth(LocalDate.of(1994,03,20))
					.location("Mumbai")
					.gender(Gender.MALE)
					.isFavorite(true)
					.build();
			contactRepository.saveAll(List.of(om,stuart));
		};


	}
}
