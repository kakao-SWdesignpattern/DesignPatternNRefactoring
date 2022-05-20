package factory.after.second;

public abstract class Car {
		
	String productName;
	
	public Car(String productName) {
		this.productName = productName;
	}
		
	public String toString() {
		return productName;
	}
}
