package test;

import java.lang.reflect.Method;

public class ReflectionTest3 {

	public static void main(String[] args) throws Exception{
		String className = "org.thinker.sample.Calculator";	
		String methodName = "doB";
		
		Class clz = Class.forName(className);		// 클래스를 불러오기, 이때 static이 올라간다
		// 메서드의 찾기 - 메서드의 이름, 파라미터들...			// 클래스를 가져오도록 한다.
		
		Object obj = clz.newInstance();				// 생성자를 구하고 객체를 생성
		
//		Method[] methods = clz.getDeclaredMethods();// 해당 객체의 선언한 메서드 목록을 가져와 담는다
		Method[] methods = clz.getMethods();		// 해당 객체의 모든 메서드목록을 가져와 담는다 (private 를 제외한)
		
		for(Method m : methods) {
			
			String mName = m.getName();
			
			System.out.println(mName);
			
			if(methodName.equals(mName)) {
				System.out.println("find : " + m);
				m.invoke(obj, null);
			}
			
		}
	}
	
}
