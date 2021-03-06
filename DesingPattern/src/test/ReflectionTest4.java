package test;

import java.lang.reflect.Field;

public class ReflectionTest4 {
	
	public static void main(String[] args) throws Exception{
		
		Class clz = Class.forName("org.thinker.sample.MemberVO");
		
		Object obj = clz.newInstance();
		
		System.out.println(obj);
		
//		Field idField = clz.getField("id");			// private는 getDeclaredField를 사용해야함
		Field idField = clz.getDeclaredField("id");
		
		idField.setAccessible(true);
		
		idField.set(obj, "USER00");
		
		System.out.println(obj);
		
	}

}
