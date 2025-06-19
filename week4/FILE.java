package week4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class FILE {

public static void main(String[] args) throws IOException {

File f=new File("test.csv");
if(f.createNewFile()) {
	
System.out.println("created");
}
else {
	System.out.println("Already exists");
}

FileWriter fwrite=new FileWriter(f);
fwrite.append("This is new tesxt");
fwrite.append("This is new line");
fwrite.close();
//read
Scanner sc = new Scanner(f);
int c=0;
while(sc.hasNext()) {
	c++;
String word=sc.nextLine();
System.out.println(word);
System.out.println(word.length());
c+=word.length();
}
System.out.println(c);

	
}
}

//int c=0;










