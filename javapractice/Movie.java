package javapractice;
import java.io.*;
import java.net.*;

 public class Movie implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	String genre;
	int rating;
	transient Player n;
	
	Movie() {
		n = new Player();
	}
	void playIt() throws Exception{
		System.out.println("Playing the movie " + title);
		if(title.equals("pat")) {
			throw new Exception();
		}
		
		
	}
}

class Hobbit extends Movie  {
	public static void main ( String[] args) {
		Hobbit h = new Hobbit();
		try {
		h.playIt();}
		catch(Exception ex) {
			
		}
		
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(h);;
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
		Socket chatSocket = new Socket("127.0.0.1", 5000);
		InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
		BufferedReader reader = new BufferedReader(stream);
		String message = reader.readLine();
		}
		catch(Exception ex) {
			
		}
		
		try {
			Socket chatSocket = new Socket("127.0.0.1", 5000);
			PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
			writer.println("message to send");
			writer.print("another message");

			
		}catch(Exception ex) {
					}
	
	}
}

