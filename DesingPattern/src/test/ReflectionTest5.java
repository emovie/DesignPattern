package test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectionTest5 {

	public static void main(String[] args) throws Exception{
		
		Map<String,String> paramMap = new HashMap<String, String>();
		
		paramMap.put("name", "홍길동");
		paramMap.put("id", "USER00");
		
		Class clz = Class.forName("org.thinker.sample.MemberVO");
		// clz - MemberVO 클래스를 가지는 변수
		
		
		Object obj = clz.newInstance();
		// obj - MemberVO를 가지는 객체
		
		BeanInfo info = Introspector.getBeanInfo(clz);
		// info - MemberVO 클래스에 대한 정보
		
		PropertyDescriptor[] props = info.getPropertyDescriptors();
		// props - MemberVO 클래스에 property를 배열로 가짐

		for(PropertyDescriptor p : props) {
			
			System.out.println(p.getDisplayName());
			System.out.println(p.getPropertyType());
		
			Method setMethod = p.getWriteMethod();
			
			if(setMethod == null) {
				continue;
			}
			
			setMethod.invoke(obj, paramMap.get(p.getDisplayName()));
			
		}
		
		System.out.println(obj);
		
	}
	
}
