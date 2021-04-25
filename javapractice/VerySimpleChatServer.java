package javapractice;
import java.io.*;
import java.net.*;
import java.util.*;

public class VerySimpleChatServer {
	ArrayList clientOutputStreams;
	
	
	public class ClientHandler implements Runnable {
		BufferedReader reader;
		Socket sock;
		public ClientHandler(Socket sock) {
			try {
			this.sock = sock;
			InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
			BufferedReader reader = new BufferedReader(isReader);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		public void run() {
			String message;
			try {
				while((message = reader.readLine()) != null) {
					System.out.println("read " + message);
					tellEveryone(message);
			
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
	}
	
	
	public static void main (String[] args) {
		 VerySimpleChatServer a = new  VerySimpleChatServer();
		 a.go();
	}
	
	public void go() {
		clientOutputStreams = new ArrayList();
		try {
			ServerSocket serverSock = new ServerSocket(5000);
			
			while(true) {
				Socket sock = serverSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				clientOutputStreams.add(writer);
				
				Thread t = new Thread(new ClientHandler(sock));
				t.start();
				System.out.println("got a connection");
			}
			
		} catch(Exception ex) {ex.printStackTrace();}
	}
	
	public void tellEveryone(String message) {
		Iterator it = clientOutputStreams.iterator();
		while(it.hasNext()) {
			try {
				PrintWriter writer = (PrintWriter) it.next();
				writer.println(message);
				writer.flush();
			}catch(Exception ex) {
				 ex.printStackTrace();
			 }
		}
		
	}

}
