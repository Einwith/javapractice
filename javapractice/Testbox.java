package javapractice;

import java.util.Calendar;
import java.util.Date;

public class Testbox {
	 
	 
	 public static void main (String[] args) {
	 String s = "2";
	 int i = Integer.parseInt(s);
	 double b = Double.parseDouble("4.11143");
	 boolean c = Boolean.parseBoolean("True");
	 System.out.println(String.format("%tc", new Date() ));
	 System.out.println(String.format("%tr", new Date()));
	 Date today = new Date();
	 System.out.println(String.format("%tA, %tB %td", today, today, today));
	 
	
	 String e = "" + b;
	 System.out.println(String.format("%,d", 5999594));
	 String g = String.format("how much money do you want right now? %d%.3f", 9,100000000.);
	 System.out.println(g);
	 
	 Calendar cal = Calendar.getInstance();
	 cal.set(2004,0,7,15,40);
	 long day1 = cal.getTimeInMillis();
	 day1 += 1000*60*60;
	 cal.setTimeInMillis(day1);
	 System.out.println("new hour " + cal.get(cal.HOUR_OF_DAY));
	 cal.add(cal.DATE, 35);
	 System.out.println("add 35 days" + cal.getTime());
	 cal.roll(cal.DATE,35);
	 System.out.println("roll 35 days" + cal.getTime());
	 cal.set(cal.DATE, 1);
	 System.out.println("set to 1 " + cal.getTime());
	 
	 }
	 
	 
	 public void go() {
	 
	 
	 }
	}