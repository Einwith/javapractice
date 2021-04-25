package javapractice;

class DrumKitTestDrive {
	public static void main(String [] args) {
		DrumKit d = new DrumKit();
		if (d.snare == true) {
			 d.playSnare();
			 }
		 d.playTopHat();
		 
		 
		 int a = 4;
		 byte b = 4;
		 System.out.println(a == b);
		 
		 Dog[] dogs = new Dog[2];
		 dogs[0] = new Dog();
		 dogs[1] = new Dog();
		 Dog dog3 = dogs[1];
		 System.out.println(dogs[0] == dogs[1]);
		 System.out.println(dog3 == dogs[1]);
		 
	}

}




class DrumKit{
	
	boolean topHat = true;
	boolean snare = true;
	
	void playTopHat () {
		System.out.println("ding ding da-ding");
	}
	
	
	void playSnare() {
		 System.out.println("bang bang ba-bang");
	}
}