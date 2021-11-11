package factoryMethod.concrete;

import java.util.Date;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreate;

public class MPCreator extends ItemCreate {

	@Override
	protected void requestItemInformation() {
		System.out.println("DB에서 MP회복 물약이 정보를 받아온다");
	}

	@Override
	protected void createItemLog() {
		System.out.println("MP회복 물약의 생성 Log : "+new Date());
	}

	@Override
	protected Item createItem() {
		return new MPPotion();
	}

}
