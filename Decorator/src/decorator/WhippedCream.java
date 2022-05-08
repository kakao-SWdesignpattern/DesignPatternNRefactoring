package decorator;

public class WhippedCream extends Decorator{

	public WhippedCream(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.print("Adding WhippedCream ");
	}

}
