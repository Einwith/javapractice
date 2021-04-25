package javapractice;
import java.util.ArrayList;

class SimpleDotCom {
	
	ArrayList<String> locations = new ArrayList<String>();
	
	
		
	
	void setLocationCells(ArrayList<String> locations) {
		this.locations = locations;
		
	}
	
	String checkYourself(String userGuess) {
		
		
		String result = "miss";
		
		int index = locations.indexOf(userGuess);
		
		if(index >= 0) {
			
			locations.remove(userGuess);
			if(locations.isEmpty()) {
				result = "kill";
			}
			else result = "hit";
		}
		
		System.out.println(result);
		
		return result;
	}
	
	
	
	
}



