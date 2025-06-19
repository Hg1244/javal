package week4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File1 {
//CRUD 
	public static void main(String[] args ) throws IOException {
		File f=new File("test.txt");
		if(f.createNewFile()) {
			//f.setReadOnly();
			System.out.println("Created");
		}else {
			System.out.println("Already exists");
		}
		//FileWriter fwrite=new FileWriter(f);
	//fwrite.append("This new text");
	//fwrite.append("\nThis new one");
		//fwrite.close();
		Scanner sc=new Scanner(f);
		int c=0;
		while(sc.hasNext()) {
			c++;
			String word = sc.nextLine(); 
			System.out.println(word);
			 System.out.println(word.length());
		//	System.out.println(sc.nextLine());
		          // ✅ Now 'word' is declared and assigned
	                // ✅ Now it works fine
	   //     System.out.println(word.length());
	        c+=word.length();
	       // sc.close();
			
		}
	System.out.println(c);
	
		
		

	}

}
