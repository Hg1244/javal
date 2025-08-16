package week7;

import java.util.Arrays;

enum coffee{
	ESPRESSO (60,80) ,
	LATTE (240,150),
	CAPPUCCINO (180,130),
	AMERICANO (200,120);
	
	
	private int size;
	private int price;
	
	   coffee(int i, int j) {
	   this.size=i;
	   this.price=j;
	}

   public int getsize() {
	    return size;
   }
	
   public int getprice() {
	   return price;
   }
}
public class EN {
public static void main(String[] args) {
	
	coffee mycoffee=coffee.AMERICANO;
	System.out.println(mycoffee+"-"+mycoffee.getsize()+"ml"); 
	
	
	System.out.println(mycoffee+"-"+mycoffee.getprice()+"rs");
	System.out.println(Arrays.toString(coffee.values()));
	}
}


