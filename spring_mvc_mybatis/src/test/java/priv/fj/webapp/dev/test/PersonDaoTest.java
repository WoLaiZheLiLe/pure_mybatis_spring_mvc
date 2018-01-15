package priv.fj.webapp.dev.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fj.dao.PersonDao;
import com.fj.domain.PersonDO;

import priv.fj.webapp.dev.BaseTest;

public class PersonDaoTest extends BaseTest {

	@Autowired
	private PersonDao personDao;
	
	@Test
	public void testInsert() {
		PersonDO personDo = new PersonDO();
		personDo.setId(1);
		personDo.setName("fj");
		personDo.setAge(12);
		//Integer count = personDao.insert(personDo);
		//System.out.println(count);
	}

}
