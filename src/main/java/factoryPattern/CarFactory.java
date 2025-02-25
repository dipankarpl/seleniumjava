package factoryPattern;

public class CarFactory {

	Car car;

	public Car getCar(String carType) {
		switch (carType.toLowerCase()) {
		case "suv":
			car = new SUV();
			break;
		case "sedan":
			car = new Sedan();
			break;
		default:
			return null;
		}
		return car;

	}
}
