package javapractice;
import java.io.*;
import java.util.ArrayList;

public class SimpleDotComGame {
	public static void main (String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);
		
		ArrayList<String> locations = new ArrayList<String>();
		locations.add(""+randomNum);
		String l2 = ""+(randomNum+1);
		String l3 = ""+(randomNum+2);
		locations.add(l2);
		locations.add(l3);

		theDotCom.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while(isAlive == true)
		{
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if(result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
		
}

