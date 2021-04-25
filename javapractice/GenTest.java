package javapractice;

import java.util.ArrayList;

public class GenTest<T> {
	

		public boolean add(T o) {
			System.out.println(o.toString());
			return true;
		}
		
		public static void main(String[] args) {
			GenTest<Pe> gen = new GenTest<Pe>();
			Pe peo = new Pe();
			gen.add(peo);
		}
	}

	class Pe {
		@Override
		public String toString() {
			return "object pe";
		}
	}


public class gen<T>{
	public void add (T o) {
		
	}
	
	public <E extends Jm> void generi(ArrayList<E> o) {
		
	}
}



