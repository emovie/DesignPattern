package test;

import java.lang.reflect.Constructor;

public class ReflectionTest2 {
		
	public static void main(String[] args) throws Exception{
		
		String className = "org.thinker.sample.TestObj";
		
		Class clz = Class.forName(className);
		// 생성자가 없거나 ()생성자가 있는 경우는 클래스에서 바로 객체 생성 가능
		
//		Object obj = clz.newInstance();
//		// 생성자를 만들경우 static은 실행되지 않고 생성자만 실행
//		
//		System.out.println(obj);
		
//		Constructor con = clz.getDeclaredConstructor(String.class);
		
//		Object obj = con.newInstance("");
		// null은 객체로 만들 수 없다
		// why? con은 String으로 생성자를 접근하도록 되어있음
		
		Constructor con = clz.getConstructor(null);
		
		System.out.println(con);
		
	}	
	
}
