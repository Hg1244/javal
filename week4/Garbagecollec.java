package week4;

public class Garbagecollec {
	@Override
    public void finalize() {
		System.out.println("clean the junk files");
	}
	
	

	public static void main(String[] args) {
		for(int i=0;i<10000000;i++) {
		Garbagecollec g=new Garbagecollec();
		
		
	}
	}

}