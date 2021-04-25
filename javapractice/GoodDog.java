package javapractice;



class GoodDog {

	private int size;
	
	public int getSize() {
		return size;
	}
	
	
	public boolean setSize(int size) {
		this.size = size;
		return true;
	}
	
	void bark() {
		if (size > 60) {
			
		}
	}
}

class GoogleDogTestDrive {
	public static void main (String[] args) {
		GoodDog one = new GoodDog();
		boolean set = one.setSize(70);
		if(set) {
		System.out.println(one.getSize());
	
		}
		
	
		
		
		
		
		Dog[] pets;
		pets = new Dog[7];
		
		pets[0] = new Dog();
		pets[1] = new Dog();
		
		pets[0].setSize(30);
		System.out.println(pets[1].getSize());
		int j = pets[0].getSize();
		
	}
}



