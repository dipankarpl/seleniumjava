package factoryPattern;

public class CarTest {

	public static void main(String[] args) {
		CarFactory cf=new CarFactory();
		cf.getCar("seDan").assemble();

	}

}
