package com.omprakashgautam.app.contactspro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Contacts pro application.
 */
@SpringBootApplication
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
	//TODO 2. Add repository layer
	//TODO 2.1: Add entity listeners to automatically updated created on and updated on
	//TODO 3. Add Service layer
	//TODO 4: Add Rest layer
	//TODO 5: Add swagger to document api's
	//TODO 6: Configure Logging
	//TODO 7: Add hateos to rest api
	//TODO 8: Add global exception handler
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
}
