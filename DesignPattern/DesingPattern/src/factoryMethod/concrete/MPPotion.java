package factoryMethod.concrete;

import factoryMethod.framework.Item;

public class MPPotion implements Item{

	@Override
	public void use() {
		System.out.println("MP 회복");
	}

}
