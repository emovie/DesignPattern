package factoryMethod.concrete;

import java.util.Date;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreate;

public class HPCreator extends ItemCreate {

	@Override
	protected void requestItemInformation() {
		System.out.println("DB에서 체력 회복 물약의 정보를 가져옴");
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 회북 물약을 생성한 기록 : "+new Date());
	}

	@Override
	protected Item createItem() {
		return new HPPotion();
	}

	
}
