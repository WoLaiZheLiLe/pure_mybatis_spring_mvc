package priv.fj.webapp.dev.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fj.service.PersonService;

import priv.fj.webapp.dev.BaseTest;

public class PersonServiceTest extends BaseTest {
	
	@Autowired
	private PersonService personService;
	
	@Test
	public void testUpdatePerson() {
		Integer oderId = 1;
		Integer personId = 1;
		Integer age = 111;
		boolean updatePerson = personService.updatePerson(oderId, personId, age);
		System.out.println(updatePerson);
 	}

}
