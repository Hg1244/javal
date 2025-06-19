package week4;

import java.util.Arrays;

enum weekday{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

public class ENN {

	public static void main(String[] args) {
	weekday w=weekday.valueOf("MONDAY");
	System.out.println(w);
	//System.out.println(weekday.values());
	System.out.println(Arrays.toString(weekday.values()));
	switch('a') {
	case 'a':
	   System.out.println("MONDAY");
	   break;
	}
	switch('b') {
	
	case 'b':
	System.out.println("TUESDAY");
	break;

	}
	
	}

}