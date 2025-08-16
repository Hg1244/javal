package week7;

public class EH {

	public static void main(String[] args){
		
	          try {
	        	  String s= null;
	        	  System.out.println(s.length());
               }
	          catch (NullPointerException e){
	        	  System.out.println("It leads to erro");
                  e.printStackTrace();
	        	}
	          finally {
		          System.out.println("next process");  
	          }
	          
	          
	}

}

