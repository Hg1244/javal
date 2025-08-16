package week7;

import java.util.Arrays;

public class Data {
	static byte a=100;
	 int[]h=new int[2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(a); 
       
      byte s=123;
      short b='s';
      System.out.println(s);
      
      double d=12.4;
      byte c= (byte)d;
      System.out.println(d);
      
     
      Data j=new Data();
      j.h[0]=12;
      j.h[1]=13;
      System.out.println(j.h[0]);
     System.out.println(Arrays.toString(j.h));
      
     
     
     
    		   
	}

}
