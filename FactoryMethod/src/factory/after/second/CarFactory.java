package factory.after.second;

public abstract class CarFactory {

	final public Car manufaturingCar(String name) {
		
		Car car;
		prepareOthers();
		car = createCar(name);
		washCar();
		
		return car;
	}
		
	public void prepareOthers() {
		System.out.println("prepare others");
	}
	
	public void washCar() {
		System.out.println("wash car");
	}
	
	public abstract Car createCar(String name);
}
