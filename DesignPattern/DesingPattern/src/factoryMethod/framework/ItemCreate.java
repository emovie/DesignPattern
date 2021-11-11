package factoryMethod.framework;

public abstract class ItemCreate {
	
	// 팩토리 메서드 -> 템플릿 메서드
	public Item create() {	// 템플릿 메서드 패턴으 이용 -> 단계가 있음 (?)
		
		Item item;
		
		requestItemInformation();
		
		item = createItem();
		
		createItemLog();
		
		System.out.println("test");
		System.out.println("test code");
		
		return item;
	}
	
	// 아이템을 생성하기 전에 DB에서 아이템 정보를 요청
	abstract protected void requestItemInformation();
	
	// 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 DB에 아이템 생성 정보를 남김
	abstract protected void createItemLog();
	
	// 아이템을 생성하는 알고리즘
	abstract protected Item createItem();
	
}
