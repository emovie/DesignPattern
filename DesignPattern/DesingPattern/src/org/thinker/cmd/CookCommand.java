package org.thinker.cmd;

public class CookCommand implements Command {

	@Override
	public void doJob() {
		System.out.println("Cook");
	}

}
