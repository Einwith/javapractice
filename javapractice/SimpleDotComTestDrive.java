package javapractice;
import java.util.ArrayList;

class SimpleDotComTestDrive {

	public static void main (String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("12");
		locations.add("3");
		locations.add("4");
		
		dot.setLocationCells(locations);
		
		String userGuess = "12";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		
		if(result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}
}



