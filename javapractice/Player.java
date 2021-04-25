package javapractice;

public class Player {
	int number = 0;
	public int guess() {
		this.number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
		return number;
	}
}


