package com.example.batchprocessing;

import java.security.SecureRandom;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
	
	private static final Random  RANDOM = new SecureRandom() ;
	private static final String  ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefhgijklmnopqrstuvwxyz" ;

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

	
	private String generatePassword(int length) {
		StringBuilder returnValue = new StringBuilder(length);
		for (int i = 0 ; i < length ; i++) {
			returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length()))) ;
		}
		return new String(returnValue);
	}
	
	@Override
	public Person process(final Person person) throws Exception {
		final int id = person.getId() ;
		final String firstName = person.getPrenom().toUpperCase();
		final String lastName = person.getNom().toUpperCase();
		final String email = person.getEmail() ;
		final Person transformedPerson = new Person(id, firstName, lastName, email);
		transformedPerson.setPassword(generatePassword(10) );

		log.info("Converting (" + person + ") into (" + transformedPerson + ")");

		return transformedPerson;
	}

}
