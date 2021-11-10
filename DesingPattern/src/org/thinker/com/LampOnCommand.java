package org.thinker.com;

public class LampOnCommand implements Command {
	// 실행되는 기능을 구현하는 클래스
	
	private Lamp lamp;
	
	public LampOnCommand(Lamp lamp) {
		this.lamp = lamp;
	}
	
	public void execute() {
		lamp.turnOn();
	}
	
}
