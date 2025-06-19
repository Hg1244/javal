package week4;

import java.io.File;
import java.io.IOException;

public class Classdel {

	public static void main(String[] args ) throws IOException {
		File f=new File("test.txt");
		if(f.delete()) {
			System.out.println("deleted");
		}else {
			System.out.println("no file exists");
		}
	}

}
