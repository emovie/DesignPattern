package org.thinker.com;

public class Lamp {
	// Receiver
	// ConcreateCommand에서 execute()를 구현할 때 필요한 클래스
	// ConcreteCommand의 기능을 실행하기 위해 사용하는 수신자 클래스
	// Client가 요청한 내용에 대해 액션만 취해주면 됨
	// 어떤 Client인지는 알 필요가 없음
	
	public void turnOn() {
		System.out.println("Lamp On");
	}
	
	public void turnOff() {
		System.out.println("Lamp Off");
	}
	
}
