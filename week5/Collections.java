package week5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;


public class Collections {

	public static  void main(String[] args) {
		ArrayList<Integer> a =new ArrayList();
		
		//ADD
		a.add(12);
		a.add(21);
		a.add(22);
		a.add(0,20);//----->index with number what you prefer
		a.add(22);
		System.out.println(a);
		
		
		//READ
		System.out.println(a.get(2));//---->read
		
	
		//UPDATE
		a.set(1, 23);//---->update
		System.out.println(a);
		
			//REMOVE INDEX
		a.remove(1);//----->remove the index
		System.out.println(a);
		
		
		LinkedList<Integer> a1 = new LinkedList<>();//---> Linked list
	    a1.addAll(a);
	    a.remove(0);//--->removve the number from index 0
	  //  a1.clear();
	    System.out.println(a1);
	   
	  //  System.out.println(a1);
	    

	   
	    System.out.println(a1.contains(22));  // true
	    
	    System.out.println(a1.indexOf(22));  // shows the 22 oda index position
	    
	    System.out.println(a1.lastIndexOf(22));// last index of array 
	    
	    System.out.println(a1.isEmpty());// it shows true or false if the array is empt true either false
	    a1.sort(null);
	    System.out.println(a1);//sort in ascending order
	    
	    System.out.println(a1.subList(0, 3));
	    
	     // it shows from 0th index to 3rd index
	    
	    for (int i = 0; i < a1.size(); i++) {   //a1.get(i) always gets the all element of the list.
	    	System.out.println(a1.get(i));                                     //You are printing this same first element multiple times
	                                          //     — once for every element in the list.
	    }
	    	Iterator<Integer>it=a1.iterator();
	    	while(it.hasNext()) {      // n
	    		int num=it.next();
	    		if(num==21) {
	    			it.remove();
	    		}
				System.out.println(a1);
			}
	 	
	    }
			
		}  
	    


		
	

	
	

