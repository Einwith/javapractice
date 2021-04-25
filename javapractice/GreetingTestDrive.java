package javapractice;

import java.util.ArrayList;

public class GreetingTestDrive {

	public static void main (String[] args) {
	ArrayList<Greeting> people = new ArrayList<Greeting>();
	Jm Jamal = new Jm();
	Cashier mistress1 = new Cashier();
	people.add(Jamal);
	people.add(mistress1);
	
	people.get(0).greet();
	
	people.get(0).phone();
	}
	
}


