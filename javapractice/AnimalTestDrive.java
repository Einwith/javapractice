package javapractice;

import java.util.ArrayList;

public class AnimalTestDrive {
	public static void main(String[] args) {

	MyAnimalList list = new MyAnimalList();
	Cat c = new Cat();
	Dog d = new Dog();
	list.add(c);
	list.add(d);
	
	if(c.equals(d)) {
		System.out.println("true");
		
		
	} else {
		System.out.println("false");
	}
	
	System.out.println(d.hashCode());
	
	System.out.println(d.toString());
	

	ArrayList<Object> doglist = new ArrayList<Object>();
	Dog adog = new Dog();
	Cat acat = new Cat();
	doglist.add(adog);
	doglist.add(acat);
	
	Dog newdog = (Dog)doglist.get(0);
	
	System.out.println(newdog.getClass());
	newdog.bark();
	
	
	
	}
	
	public void go() {
		Dog dogg = new Dog();
		Object somedog = getObject(dogg);
	}
	
	public Object getObject(Object o)
	{
		return o;
	}
	
	
}


