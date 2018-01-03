package priv.fj.test;

import org.junit.Test;

import com.fj.dao.PersonDao;

public class ProxyTest {  
	  
    @Test  
    public void testProxy() throws Throwable {  
    		PersonDao method = MethodProxyFactory.newInstance(PersonDao.class);
    }  
      
    @Test  
    public void testGenerateProxyClass() {
	    	int tmp = 3;
	    	Object t = tmp;
	    	System.out.println(t.getClass().getName());
	    ProxyGeneratorUtils.writeProxyClassToHardDisk("/Users/ji_fei/test/$Proxy11.class");
    }  
}  
