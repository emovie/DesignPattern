package org.thinker.com;

public class LampOffCommand implements Command {
	// 실행되는 기능을 구현하는 클래스
	
	private Lamp lamp;
	
	public LampOffCommand(Lamp lamp) {
		this.lamp = lamp;
	}
	
	@Override
	public void execute() {
		lamp.turnOff();
	}
	
}
