package week7;

import java.util.ArrayList;
import java.util.LinkedList;

public class H {

	public static void main(String[] args) {
	
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(3);
		System.out.println(a);
		System.out.println(a.get(0));
		
		a.set(1, 6);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		
		
		System.out.println(a.contains(a));
		a.addLast(1);
		System.out.println(a);
		a.addLast(5);
		System.out.println(a);
		
		
		LinkedList<Integer> list = new LinkedList<>();
		list.offer(1);
		list.offer(2);
		System.out.println(list);
	

	}

}
