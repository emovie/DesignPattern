package factoryMethod.concrete;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreate;

public class Main {
	
	public static void main(String[] args) {
		ItemCreate creator;
		Item item;
		
		creator = new HPCreator();
		item = creator.create();
		item.use();
		
		
		creator = new MPCreator();
		item = creator.create();
		item.use();
	
	}

}
