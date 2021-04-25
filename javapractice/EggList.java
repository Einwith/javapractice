package javapractice;

import java.util.ArrayList;

public class EggList {

	public static void main(String[] args) {
		ArrayList<Egg> eggs = new ArrayList<Egg>();
		ArrayList<String> strList = new ArrayList<String>();
		
		
		eggs.add(new Egg());
		
		Egg a = new Egg();
		eggs.add(a);
		
		Egg b = new Egg();
		eggs.add(b);
		
		
		
		
		System.out.println(eggs.size());
		
		
		System.out.println(eggs.indexOf(a));
		System.out.println(eggs.indexOf(b));
		
		System.out.println(eggs.contains(a));
		System.out.println(eggs.contains(b));
		
		System.out.println(eggs.isEmpty());
		System.out.println(eggs.remove(a));
		
		String s1 = "Frog";
		String s2 = "whoohoo";
		String s3 = "whoohoo";
		
		strList.add(s1);
		strList.add(s2);
		strList.add(s3);
		
		System.out.println(strList.get(0));
		
		String ss1 = "xx";
		String ss2 = "xx";
		
		if(ss2.equals(ss2)) {
			System.out.println("Hi, you are right.");
		}
		
		
		
		
	}
}



class Egg {
	
}
