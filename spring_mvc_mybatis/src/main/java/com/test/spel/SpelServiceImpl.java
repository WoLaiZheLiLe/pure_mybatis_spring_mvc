package com.test.spel;

import java.util.List;

import com.test.lookup.PersonIdService;

public class SpelServiceImpl implements SpelService {
	
	private Double random;
	
	private PersonIdService personIdService;
	
	private List<String> books;
	
	public Double getRandom() {
		return random;
	}
	public void setRandom(Double random) {
		this.random = random;
	}
	public PersonIdService getPersonIdService() {
		return personIdService;
	}
	public void setPersonIdService(PersonIdService personIdService) {
		this.personIdService = personIdService;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	
}
