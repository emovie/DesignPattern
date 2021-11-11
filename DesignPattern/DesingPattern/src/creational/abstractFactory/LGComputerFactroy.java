package creational.abstractFactory;

public class LGComputerFactroy implements ComputerFactory {

	@Override
	public LGKeyboard createKeyboard() {
		return new LGKeyboard();
	}

	@Override
	public LGMouse createMouse() {
		return new LGMouse();
	}

}
