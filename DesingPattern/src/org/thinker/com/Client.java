package org.thinker.com;

public class Client {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		
		Command lampOnCommand = new LampOnCommand(lamp);
		Command lampOffComand = new LampOffCommand(lamp);
		
		Button button = new Button(lampOnCommand);
		button.pressed();
		
		button.setCommand(lampOffComand);
		button.pressed();
		
	}
	
}