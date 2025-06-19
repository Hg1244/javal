package week5;

import java.io.File;

public class FileD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new  File("rrr.txt");
				if(f.delete()) {
					System.out.println("deleted");
				}
				else {
					System.out.println("no file exists");
				}
	}

}
