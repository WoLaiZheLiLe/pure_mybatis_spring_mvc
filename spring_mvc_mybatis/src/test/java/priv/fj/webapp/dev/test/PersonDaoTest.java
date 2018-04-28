package priv.fj.webapp.dev.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
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
	
	@Test
	public void testUpdate() {
		PersonDO personDo = new PersonDO();
		personDo.setName(null);
		//personDao.updateStatus(1, personDo);
	}
	
	@Test
	public void testSelect() {
		
		//PersonDO query = personDao.query("a");
		//System.out.println(JSON.toJSONString(query));
	}


}
