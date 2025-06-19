package week5;

import java.util.HashMap;

public class HM {

	public static void main(String[] args) {
		HashMap <Integer,String> a= new HashMap<Integer,String>();
		a.put(1, "NIVI");
		a.put(2, "DIVI");
		a.put(3, "GAYU");
		a.put(4, "LAKSHMI");
    System.out.println(a);
    
    System.out.println(a.get(1));//op:nivi
    
    System.out.println(a.get("uiii"));//op:null
    
    System.out.println(a.getOrDefault(1, "NIVI"));//op:nivi
    
    System.out.println(a.containsKey(4));//true
    
    System.out.println(a.containsKey(6));//false
    
    System.out.println(a.containsValue("nivi"));//false
    
    System.out.println(a.containsValue("NIVI"));//true
    
    System.out.println(a.isEmpty());//false
    
    System.out.println(a.entrySet());// op will be like a an array [1=NIVI, 2=DIVI, 3=GAYU, 4=LAKSHMI]

 
	}
	
	
	

}
