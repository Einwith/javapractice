package javapractice;
import java.io.*;

class DungeonGame implements Serializable {
	
	public int x = 3;
	transient long y = 4;
	private short z = 5;
	
	short getZ() {
		 return z;
	}
	long getY() {
		 return y;
		 }
	int getX() {
		 return x;
	}
	

}
	
	
	class DungeonTest {
		public static void main(String [] args) {
			 DungeonGame d = new DungeonGame();
			 System.out.println(d.getX()+d.getY()+d.getZ());
			 try {
			 
			 FileOutputStream fos = new
					 FileOutputStream("dg.ser");
			 ObjectOutputStream oos = new
					 ObjectOutputStream(fos);
			 oos.writeObject(d);
			 
			 oos.close();
			 
			 FileInputStream fis = new
					 FileInputStream("dg.ser");
			 ObjectInputStream ois = new
					 ObjectInputStream(fis);
			 d = (DungeonGame) ois.readObject();
			 ois.close();
			 
			 System.out.println(d.getX()+d.getY()+d.getZ());
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
			 
			 Socket chatSocket = new Socket("196.164.1.103",5000);
	}
	}
		
	