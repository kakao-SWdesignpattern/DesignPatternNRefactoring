package factory.after.second;

public class HyundaiFactory extends CarFactory{
	
	@Override
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
		System.out.println(car + " created");
		
		return car;
	}

}
