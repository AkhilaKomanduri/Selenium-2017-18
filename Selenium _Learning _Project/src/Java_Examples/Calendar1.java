package Java_Examples;

import java.util.Calendar;
import java.util.Calendar.*;
public class Calendar1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
	    int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int time = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
	System.out.println("CurrentDate");
        System.out.println("day:"+day);
        System.out.println("month" +month);
        System.out.println("year" +year);       
        System.out.println("Day of hours:" +time);
        System.out.println("Day of hours:" +min);
        System.out.println("Day of minutes:" +sec);
	}
}

	

	
	

