package javapractice;
import java.util.ArrayList;

public class DotCom {
private ArrayList<String> locations;
private String name;

public void setName(String name) {
	this.name = name;
}
public void setLocationCells(ArrayList<String> locations) {
	this.locations = locations;
}

public String checkYourself(String userGuess) {
	String result = "miss";
	int index = locations.indexOf(userGuess);
	
	if(index > 0) {
		locations.remove(index);
		
		if (locations.isEmpty()) {
			result = "kill";
			System.out.println("Ouch! You sunk" + name + " : (");
		}
		else {
			result = "hit";
		}
	}
	
	return result;
	
	
}

}
