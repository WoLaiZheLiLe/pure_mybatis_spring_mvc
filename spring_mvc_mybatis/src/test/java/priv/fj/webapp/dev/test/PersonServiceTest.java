package priv.fj.webapp.dev.test;

import java.util.regex.Pattern;

import org.apache.log4j.Logger;
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
		Integer age = 1211;
		try {
			boolean updatePerson = personService.updatePerson(oderId, personId, age);
			System.out.println(updatePerson);
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
 	}
	public static void main(String[] args) {
		String tmp = ":P";
	    Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\u4E00-\\u9FA5_,.?!:;…~_\\-\"\"/@*+'()<>{}/[/]()<>{}\\[\\]=%&$|\\/♀♂#¥£¢€\"^` ，。？！：；……～“”、“（）”、（——）‘’＠‘·’＆＊＃《》￥《〈〉》〈＄〉［］￡［］｛｝｛｝￠【】【】％〖〗〖〗／〔〕〔〕＼『』『』＾「」「」｜﹁﹂｀．]");
	}

	
	@Test
	public void testUpdatePersons() {
		Integer oderId = 1;
		Integer personId = 1;
		Integer age = 1211;
		boolean updatePerson = personService.updatePerson(oderId, personId, age);
		System.out.println(updatePerson);
		
 	}
}
