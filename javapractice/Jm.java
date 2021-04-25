package javapractice;

public class Jm extends Greeting implements important, mylove{
	public void greet() {
		super.greet();
		System.out.print("what you doing?");
		
		
		
	}
	public void sex() {
		System.out.print("Yes! Jm!");
		
	
	}
	
	public void phone() {
		System.out.print("We talk like business people.");
	}
}

interface important {
	public abstract void sex();
}

interface mylove {
	
}