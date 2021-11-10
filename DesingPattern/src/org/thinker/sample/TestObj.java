package org.thinker.sample;

import org.thinker.sample.TestObj;

public class TestObj extends ParentObj {
	
	static {
		System.out.println("TestObj static block");
	}
	// static은 메모리 상에 올라가면서 main보다 먼저 실행된다
	// 최초 한번만 실행된다
	
//	public TestObj() {
//		System.out.println("빈 생성자");
//	}
	
	public TestObj(String str) {
		System.out.println("문자열 생성자");
	}
	
	public void doA() {
		System.out.println("doA...");
	}
	
//	public static void main(String[] args) {
//		System.out.println("zzzzzzzzzzzzzzz");
//		
//		ReflectionTest1 doa = new ReflectionTest1();
//		
//		ReflectionTest1 doa2 = new ReflectionTest1();
//		
//		System.out.println(doa);
//		System.out.println(doa2);
//	}

}
