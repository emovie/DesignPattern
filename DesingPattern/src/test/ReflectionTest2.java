package test;

import java.lang.reflect.Constructor;

public class ReflectionTest2 {
		
	public static void main(String[] args) throws Exception{
		
		String className = "org.thinker.sample.TestObj";
		
		Class clz = Class.forName(className);
		// TestObj class의 정보를 clz에 담는다
		// 이때 class의 static이 존재하며 최초 실행일 경우에 실행된다
		
		Object obj = clz.newInstance();
		// clz에 담긴 클래스를 객체로 생성해 obj에 담는다
		// 생성자가 실행되며, static과는 다르게 매번 객체가 만들어질 때마다 생성자가 실행된다
	
		System.out.println(obj);
		
		
		
		// 생성자 오버로딩으로 경우의 수가 있을 때 Constructor클래스의 메서드에서 파라미터 타입을 넣어줌으로써 원하는 생성자를 가진 class 객체를 만들 수 있다
//		Constructor con = clz.getDeclaredConstructor(String.class);
		Constructor con = clz.getConstructor(String.class);

		Object obj2 = con.newInstance("");
		// 단, 이 경우 객체 생성 시 해당 타입의 파라미터값만을 넘겨줘야한다
		
		System.out.println(obj2);
		
	}	
	
}
