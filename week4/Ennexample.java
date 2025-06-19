package week4;
import java.util.*;

enum Days{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY
	
}
public class Ennexample {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
		try {
			System.out.println("ENTER THE DAYS:");
			String days=sc.nextLine();
			Days d=Days.valueOf(days);
			System.out.println(Arrays.toString(Days.values()));

			break;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
			
		
		}
	}
	}


