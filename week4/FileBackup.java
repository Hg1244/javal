package week4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileBackup {

	public static void main(String[] args) throws IOException  {
		File f=new File("test.txt");
		Scanner sc=new Scanner(f);
		String backup="";
		
		while(sc.hasNextLine()){
			backup+=sc.nextLine()+"\n";
		}
		System.out.println(backup);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("ENTER THE LINE TO PASTE:");
		String words=sc1.nextLine(); 
		
		FileWriter write=new FileWriter(f);
		write.append(backup);
		write.append(words);
		write.close();
		  
		
	}

}
 