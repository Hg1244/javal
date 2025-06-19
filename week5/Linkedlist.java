package week5;

import java.util.LinkedList;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList <Integer>a=new LinkedList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);   //add
		System.out.println(a);
		a.addFirst(1); //addfirst
		a.addLast(5);  // addlast
		System.out.println(a);
		
		
		//a.get(1);
//		a.removeFirst();
//		System.out.println(a);
		System.out.println(a.getFirst());	//getfirst
		System.out.println(a.removeLast()); //removelast
		    
	    
	    System.out.println(a.get(1)); //get
	
//  a.clear();  
//  System.out.println(a);//clear
	

//	//   System.out.println(a);
               //1,2,3,4,5,5
		 System.out.println(a.remove(5));
		 
		 a.remove(Integer.valueOf(2));
		 System.out.println(a);
	}
	
	}
//
//		System.out.println(a.removeFirst());  //removefirst
//		System.out.println(a.get(1));//get index
//		
//}
//}