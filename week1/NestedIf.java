package week1;

public class NestedIf{

	public static void main(String[] args) {
		int temp=0;
		if(temp>40) {
			System.out.println("very hot");
		}
		else if(temp>=31&&temp>=40) {
			System.out.println("hot");
		}
		else if(temp>=21&&temp>=30) {
			System.out.println("Warm");
		}
		else if(temp>=11&&temp>=20) {
			System.out.println("cool");
		}
		else if(temp>=0&&temp>=10) {
			System.out.println("cold");
		}
		else if(temp<0){
			System.out.println("freezing");
		}
		else {
			System.out.println("out of contol");
		}
		
		

	}
}
