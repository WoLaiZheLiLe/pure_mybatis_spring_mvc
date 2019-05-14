package priv.fj.webapp.dev.test;

import java.util.List;

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
		List<PersonDO> query = personDao.query();
		System.out.println(JSON.toJSONString(query));
	}

	@Test
	public void testQueryById() {
	}

	@Test
	public void testQueryByDynamicId() {
		List<PersonDO> query = personDao.queryByDynamicId(1);
		System.out.println(JSON.toJSONString(query));
	}
}
