package javapractice;

public class Dog extends Animal{
	String name;
	private int size;
	public static void main (String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		Dog[] Dogs = new Dog[3];
		
		Dogs[0] = new Dog();
		Dogs[1] = new Dog();
		Dogs[2] = dog1;
		
		Dogs[0].name = "Fred";
		Dogs[1].name = "Marge";
		
		System.out.print("dog's name is " + Dogs[2]);
		
		
		for(int i = 0; i < Dogs.length; i++) {
			Dogs[i].bark();
		}
	}
	
	
	
	
	public boolean setSize(int size) {
		this.size = size;
		return true;
	}
	public int getSize()
	{
		return this.size;
	}
	public void bark() {
		System.out.println(name + " says Ruff!");
	}
}


