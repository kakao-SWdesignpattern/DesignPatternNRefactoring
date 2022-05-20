package factory.before;

public class CarTest {
	
	public static void main(String[] args) {
		
		CarTest test = new CarTest();
		Car car = test.produceCar("Sonata");
			
		System.out.println(car);
	}
	
	public Car produceCar(String name) {
	
		Car car = null;
		
		if( name.equalsIgnoreCase(Car.SONATA)) {
			car = new Car(Car.SONATA);
		}
		else if( name.equalsIgnoreCase(Car.GRANDEUR)) {
			car = new Car(Car.GRANDEUR);
		}
		else if( name.equalsIgnoreCase(Car.GENESIS)) {
			car = new Car(Car.GENESIS);
		}
		else {
			car = new Car("noname");
		}
		
		return car;
	}
}
