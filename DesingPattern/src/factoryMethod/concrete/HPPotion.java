package factoryMethod.concrete;

import factoryMethod.framework.Item;

public class HPPotion implements Item{

	@Override
	public void use() {
		System.out.println("체력 회복");
	}
	
}
