package javapractice;

public class PhraseOMatic {
	public static void main (String[] args) {
		
		//make three sets of words to choose from.
		String[] wordListOne = {"24/7","multi-Tier"};
		String[] wordListTwo = {"oriented", "empowered", "focused"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture"};
		
		//find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		
		//generate three random index for the lists
		int index1 = (int) (Math.random() * oneLength);
		int index2 = (int) (Math.random() * twoLength);
		int index3 = (int) (Math.random() * threeLength);
	
		//build a phrase
		String phrase = wordListOne[index1] + " " + wordListTwo[index2] + " " + wordListThree[index3];
		
		//print out the pharse
		System.out.println("What we need is a " + phrase);
		}
	}

