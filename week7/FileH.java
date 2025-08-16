package week7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileH {

	public static void main(String[] args) throws IOException {
		
  File f= new File("Helllo.txt");
  if(f.createNewFile()) {
	  System.out.println("File created");
	  } else {
		  System.out.println("Already Exists");
	  }
  FileWriter fwrite=new FileWriter(f);
  fwrite.append("WELCOME TO THIS TEXT");
  fwrite.append(" THIS IS NEW TEXT\n");
  fwrite.close();
  
  Scanner sc=new Scanner(System.in);
  int c=0;
  System.out.println("Enter the line in text:");
  while(sc.hasNextLine()) { 
  c++;//read the multiple inputs
  String line=sc.nextLine();
  System.out.println(line);
  System.out.println(line.length());
  c+=line.length();
  }
  System.out.println(c);
	}

 }


