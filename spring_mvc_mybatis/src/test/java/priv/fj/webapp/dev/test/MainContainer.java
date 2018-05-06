package priv.fj.webapp.dev.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.test.aop.HellowWorld;
import com.test.lookup.PersonIdService;
import com.test.lookup.TooleService;
import com.test.spel.SpelService;

public class MainContainer {
	
	public static String path = "classpath*:/configruation/spring/spring-test.xml";
	
	public static String aopPath = "classpath*:/configruation/spring/spring-test-aop.xml";
	
	/** 
	* @description: TODO
	* @author: fei_ji 
	* @date: 2018年4月17日 下午2:54:57
	* @version: v1.0
	* @param ctx  
	*/
	public static void testLookUp(ApplicationContext ctx) {
		PersonIdService personService = ctx.getBean("personIdService", PersonIdService.class);
		TooleService toolServiceBean2 = personService.getToolServiceBean();
		TooleService toolServiceBean = personService.getToolServiceBean();
		System.err.println(toolServiceBean == toolServiceBean2);
	}
	/** 
	* @description: TODO
	* @author: fei_ji 
	* @date: 2018年4月17日 下午4:19:34
	* @version: v1.0
	* @param ctx  
	*/
	public static void testSpelExpression(ApplicationContext ctx) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("new String[]{'a', 'b', #a}");
		EvaluationContext eCtx = new StandardEvaluationContext();
		eCtx.setVariable("a", "aa");
		Object value = expression.getValue(eCtx);
		System.out.println(value.toString());
		//-------
		expression = parser.parseExpression("T(java.lang.Math).random()");
		Object value2 = expression.getValue();
		System.out.println(value2);
		//-------
		SpelService bean = ctx.getBean("spelService", SpelService.class);
		System.out.println(bean);
	}
	public static void testSpelExpression2(ApplicationContext ctx) {
		SpelExpressionParser parser = new SpelExpressionParser();
		String expressionStr = "new String[]{'a', 'b'}";
		Expression expression = parser.parseExpression(expressionStr);
		String[] arr = expression.getValue(String[].class);
		//System.out.println(arr[0]);
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aa");
		map.put("b", "bb");
		EvaluationContext eCtx = new StandardEvaluationContext();
		eCtx.setVariable("myMap", map);
		expression = parser.parseExpression("#myMap['a']");
		Object value = expression.getValue(eCtx);
		System.out.println(value);
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(aopPath);
//		TransactionStatus status = TransactionAspectSupport.currentTransactionStatus();
		aop(ctx);
	}
	
	public static void aop(ApplicationContext ctx) {
		HellowWorld bean = ctx.getBean("helloWorld", HellowWorld.class);
		bean.say("jifei");
	}
}
