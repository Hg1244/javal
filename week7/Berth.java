package week7;
enum days{
	Monday(1),
	TUESDAY(2),
	WEDNESDAY(3);

	private  final int position;   // field to store the number
		
	
	
	days(int position) {
		this.position = position;
	  
	}
	public int getposition(){
		return position;
		
	}
}

public class Berth {

	public static void main(String[] args) {
	 System.out.println(days.TUESDAY);
		System.out.println(days.Monday.getposition());
	}

}
