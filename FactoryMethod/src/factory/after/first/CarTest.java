package factory.after.first;

public class CarTest {
	
	public static void main(String[] args) {
		

		CarTest test = new CarTest();
		Car car = test.produceCar("sonata");
			
		System.out.println(car + "!!!");
	}
	
	
	public Car produceCar(String name) {
	
		CarFactory factory = new CarFactory();
		Car car = factory.createCar(name);
	
		return car;
	}
}
