package week5;

import java.util.HashMap;

public class Hmp {

	public static void main(String[] args) {
		
		HashMap <String,Integer> hmap = new HashMap<String,Integer>(); 
		hmap.put("NAME",1);
		hmap.put("AGE",2);
		hmap.put("ADDRESS",3);
		hmap.put("NUMBER",4);
		hmap.put("STATE",5);
		hmap.put(null, null);
		hmap.put(null, 1);
		System.out.println(hmap.get("STATE"));
		System.out.println(hmap);
		

	}

}
