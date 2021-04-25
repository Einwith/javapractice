package javapractice;

import java.util.*;

public class SortMountains {
 LinkedList<Mountain> mtn = new LinkedList<Mountain>();
 class NameCompare implements Comparator<Mountain> {
 public int compare(Mountain one, Mountain two) {
 return one.name.compareTo(two.name);
 }
 }
 class HeightCompare implements Comparator<Mountain>{
 public int compare(Mountain one, Mountain two) {
 return (two.height.compareTo(one.height));
 }
 }
 public static void main(String [] args) {
 new SortMountains().go();
 }
 public void go() {
	 int[][] a2d = new int[4][2];
	 int[] a = {1,2,3};
	 int[][] x = {{2,2},{3,4}};
	 int[][] c = new int[4][];
	 c[1] = new int[2];
	 c[0] = new int[4];
 mtn.add(new Mountain("Longs", 14255));
 mtn.add(new Mountain("Elbert", 14433));
 mtn.add(new Mountain("Maroon", 14156));
 mtn.add(new Mountain("Castle", 14265));
 System.out.println("as entered:\n" + mtn);
 NameCompare nc = new NameCompare();
 Collections.sort(mtn,nc);
 System.out.println("by name:\n" + mtn);
 HeightCompare hc = new HeightCompare();
 Collections.sort(mtn,hc);
 System.out.println("by height:\n" + mtn);
 }
}
class Mountain {
	 String name;
	 Integer height;
	 public Mountain(String name, Integer height) {
	 this.name = name;
	 this.height = height;
 }
 public String toString() {
	 Members dj = Members.BOBBY;
	 Members ts = Members.PHIL;
	 String a = name + " " + height;
	 return a;
 }
}