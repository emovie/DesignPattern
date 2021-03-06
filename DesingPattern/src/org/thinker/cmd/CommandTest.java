package org.thinker.cmd;

import java.util.HashMap;
import java.util.Map;

public class CommandTest {
	
	public static void main(String[] args) throws Exception {
		
		String[] key = {"/study", "/cleanup", "/cook"};
		
		String[] arr = {"org.thinker.cmd.StudyCommand","org.thinker.cmd.CleanupCommand","org.thinker.cmd.CookCommand"};
		
		Map<String, Command> map = new HashMap<String, Command>();		
		
		for(int i = 0; i < arr.length; i++) {
			map.put(key[i], (Command)(Class.forName(arr[i]).newInstance()));
		}
		
		String target = "/cleanup";
		
		Command targetCmd = map.get(target);
		targetCmd.doJob();
	}

}