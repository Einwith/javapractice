package javapractice;

public class Shuffe1 {
	public static void main (String [] args) {
		int x = 3;
		
		if (x > 2) {
			System.out.print("a");
		}
		
		x = x - 1;
		System.out.print("-");
		
		if( x == 2) {
			System.out.print("b c");
		}
		x = x - 1;
		System.out.print("-");
		
		if(x == 1) {
			System.out.print("d");
			x--;
		}
		
	}

}
