package javapractice;
import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("catt",10);
		scores.put("porky",20);
		scores.put("looney", 30);
		
		System.out.println(scores.get("porky"));
		System.out.println(scores);
	}
}
