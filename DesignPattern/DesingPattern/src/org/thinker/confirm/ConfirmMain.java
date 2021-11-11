package org.thinker.confirm;

import java.util.HashMap;
import java.util.Map;

public class ConfirmMain {

	public static void main(String[] args) throws Exception {
		
		String[] key = {"/reserve", "/cancle"};
		String[] org = {"org.thinker.confirm.Reserve","org.thinker.confirm.Cancle"};
		
		Map<String, Confirm> map = new HashMap<String, Confirm>();
		
		for(int i = 0; i < key.length; i++) {
			map.put(key[i], (Confirm)(Class.forName(org[i]).newInstance()));
		}
		
		String target = "/cancle";
		
		Confirm targetConfirm = map.get(target);
		
		targetConfirm.confirm();
		
	}
	
}