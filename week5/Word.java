package week5;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Word {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("rrr.txt");
    	if(f.createNewFile()) {
    	System.out.println("CREATED");
    	}else {
    		System.out.println("ALREADY EXISTS");
    	}
    	FileWriter fwrite=new FileWriter(f);
        fwrite .append("name,date\nPRAVEEN,13-08-2008");
    //    fwrite.append("\n190905");
        fwrite.close();
        
        Scanner sc=new Scanner(f);//--->read
        int c=0;// count line
        while(sc.hasNext()) {//-> consider the word by word 
        	c++;//count the lines
        	String number=sc.nextLine();/// read the whole line and stores the word
        	System.out.println(number);// print the number
        	System.out.println(number.length());// line length
        	c+=number.length();// add the lngth of line
        	
        
         }
    	
       System.out.println(c);
    }
}
