package template.after;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new ManualCar();
		myCar.run();
		System.out.println("*********************");
		
		Car herCar = new AICar();
		herCar.run();
		System.out.println("*********************");
		
		Car yourCar = new HybridCar();
		yourCar.run();
		System.out.println("*********************");
	}

}
