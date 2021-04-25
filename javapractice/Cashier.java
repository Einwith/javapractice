package javapractice;

public class Cashier extends Greeting{

	public void greet() {
		super.greet();
		System.out.print("Is that all for today?");
	}
}
