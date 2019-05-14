package priv.fj.test.mybatis;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.alibaba.fastjson.JSON;

public class TestMethodHandle {
	
	public static void test() {}
	public static void main(String[] args) throws Throwable {
//		MethodType methodType = MethodType.methodType(String.class, char.class, char.class);
//		MethodHandles.Lookup publicLookup = MethodHandles.publicLookup();
//		MethodHandle methodHandle = publicLookup.findVirtual(String.class, "replace", methodType);
//		String result = (String) methodHandle.bindTo("ab").invokeWithArguments('a', 'o');
//		System.out.println(result);
		
		Method method = TestA.class.getDeclaredMethod("test");
		int modifiers = method.getModifiers();
		
		System.out.println(Modifier.toString(modifiers));
	}
}
