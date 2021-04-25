package javapractice;

public class Boat {
	
		 private int length ;
		 public Boat() {}
		 public Boat(int length) {
			 this.length = length;
		 }
		 public void setLength( int len ) {
		 length = len;
		 }
		 public int getLength() {
			 
			 
			 return length;
		 }
		 public void move() {
		 System.out.print("drift ");
		 }
}



