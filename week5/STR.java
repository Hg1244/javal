package week5;

import java.util.Arrays;

public class STR {

	public static void main(String[] args) {
		String a="hello this is nivi";
		String [] arr=a.split(" ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]+"->"+arr[i].length());
		}
		System.out.println(Arrays.toString(arr));
        char[] carr= {'A','P','P'};
         System.out.println(String.copyValueOf(carr));
        System.out.println(a.indexOf("i"));
        System.out.println(a.lastIndexOf("i"));
     //   for (int i=0; i < a.length(); i++) {
    //    	if(a.indexOf(a.charAt(i))==a.lastIndexOf(a.charAt(i))){
      //  	System.out.println(a.charAt(i));
     //   break;
        	System.out.println(a.charAt(2));//1
        	System.out.println(a.startsWith("he"));//2
        	System.out.println(a.endsWith("nivi"));//3
        	System.out.println(a.contains("is"));//4
        	System.out.println(a.concat(" from chennai"));//5
        	
        String h="hel";
         h+="lo";
        String k="   hello ";
        System.out.println(h==k);//6
        System.out.println(k.equals(h));//7
        System.out.println(k.equalsIgnoreCase(h));//8
        
      //  String a="hello this is nivi";
        System.out.println(a.substring(6,9));//8
       //8 ---->6 lirundhuv strt aagi 9 th index la mudiuum(oru periya string la oru part ah mattum 
        //eduthu kudukum this(a.substring(a,b)) a->vandhu small, b vandhu big a vida 
        
        System.out.println(k.length());
        System.out.println(k.trim().length());
        ///k.trim()  spaces ah reduce pani  tharum, if you want to  check the length .length()->5
        
        }
	
        
        
        
        		
        	
        		
	
			
		}
	

