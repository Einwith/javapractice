package javapractice;
import java.util.ArrayList;

public final class Duck extends Boat{
	public static int duckCount = 0;
	public static final String PROPERTY = "cute";
	public static final double BAR_SIGN;
	
	public static final int x = 12;
	static {
		BAR_SIGN = (double) Math.random();
	}
	int size;
	public Duck() {
		this(12);
		duckCount++;
	}
	public Duck(int size) {	
		super(size);
		duckCount++;
		
		System.out.println("Quack");
		this.size = size;
	}
	
	public void go(final int x) {
		System.out.println(x);
	}
	final double getBarSign() {
		return BAR_SIGN * 5;
	}
	
	public void doNumsNewWay() {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		ArrayList<Character> charlist = new ArrayList<Character>();
		int a = 1;
		char b = '2';
		intlist.add(a);
		charlist.add(b);
		int c = intlist.get(0);
		char d = charlist.get(0);
	}
	
	public static void main (String[] args) {
		Duck a = new Duck();
		System.out.println(Duck.duckCount);
		a.go(10);
		System.out.println(a.getBarSign());
		System.out.println(Math.abs(-1));
		System.out.println(Math.round(21.55f));
		System.out.println(Math.min(1, 2.0));
	}
}
