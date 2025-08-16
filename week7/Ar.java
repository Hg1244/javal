package week7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ar {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList();
		//add
		a.add(3);
		a.add(8);
		a.add(19);
		a.add(9);
		a.add(4, 0);
		System.out.println(a);

		//read
	System.out.println(a.get(4));
	//update
	
	a.set(3, 10);
	System.out.println(a);
	
	
	
	a.remove(0);
	System.out.println(a);
	
	a.removeIf(c->c>10);
	System.out.println(a);
	
	System.out.println(a.contains(8));
	
	System.out.println(a.indexOf(0));
	
	System.out.println(a.lastIndexOf(8));
	
	System.out.println(a.isEmpty());
	
	System.out.println(a.subList(1, 3));
	
	
	a.sort(Comparator.reverseOrder());
	System.out.println(a);
	
	a.sort(null);
	System.out.println(a);
	
	System.out.println(a.size());
	
	ArrayList<Integer> a1=new ArrayList();
	a1.addAll(a);
	System.out.println(a1);
	
	Iterator <Integer> it=a1.iterator();
	while(it.hasNext()) {
		int num=it.next();
		if(num==4) {
			it.remove();
		}
		System.out.println(a1);
		}
	}
	
	}


