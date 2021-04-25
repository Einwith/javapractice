package javapractice;
import java.io.*;

public class WriteAFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Foo.txt");
			writer.write("hello foo!");
			writer.close();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		File f = new File("MyCode.txt");
		File dir = new File("Chapter7");
		dir.mkdir();
		
		if(dir.isDirectory()) {
			String[] dirContents = dir.list();
			for(int i = 0;i < dirContents.length; i++) {
				System.out.println(dirContents[i]);
			}
		}
		
		System.out.println(dir.getAbsolutePath());
		boolean isDeleted = f.delete();
		
		try {
		BufferedWriter bwriter = new BufferedWriter(new FileWriter("bw.txt"));
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
