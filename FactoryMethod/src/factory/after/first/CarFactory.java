package factory.after.first;

public class CarFactory {

	public Car createCar(String name) {
		
		Car car = null;
		
		if( name.equalsIgnoreCase("sonata")) {
			car = new Sonata(name);
		}
		else if( name.equalsIgnoreCase("grandeur")) {
			car = new Sonata(name);
		}
		else if( name.equalsIgnoreCase("genesis")) {
			car = new Sonata(name);
		}
		
		return car;
	}
}
