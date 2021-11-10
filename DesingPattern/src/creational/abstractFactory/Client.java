package creational.abstractFactory;

public class Client {
	
	public static void main(String[] args) {
		
		FactoryOfComputerFactory factoryOfComputerPactory = new FactoryOfComputerFactory();
		factoryOfComputerPactory.createComputer("LG");
		
	}

}
