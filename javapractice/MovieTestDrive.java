package javapractice;

public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.genre = "comedy";
		one.title = "piglet";
		one.rating = -3;

		Movie two = new Movie();
		two.genre = "tragic";
		two.title = "Lost in paradise";

		two.rating = 43;
		try {
		two.playIt();
		} catch(Exception ex) {
			
		} 
		
	} 
}
