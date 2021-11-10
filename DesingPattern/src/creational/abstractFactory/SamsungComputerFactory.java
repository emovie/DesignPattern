package creational.abstractFactory;

public class SamsungComputerFactory implements ComputerFactory {

	@Override
	public SamsungKeyboard createKeyboard() {
		return new SamsungKeyboard();
	}

	@Override
	public SamsungMouse createMouse() {
		return new SamsungMouse();
	}

}
