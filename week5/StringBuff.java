package week5;

import java.util.Arrays;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,3,4,5};
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		String s1="hello j";
		System.out.println(s1.replace("j", "h"));
		System.out.println(s1);
		
		System.out.println(Arrays.toString(a));
		
		
		StringBuilder s= new StringBuilder("Helo");
		System.out.println(s);
	    s.insert(2, "l");//---->1
	    System.out.println(s);
	    s.replace(1, 5, "hiiiiiiii");//--->2
	    System.out.println(s);
	    s.delete(1,5);//----->3
	    System.out.println(s);
}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// diff of string and string buffer is string: not mutable and string buffer: is  mutable
		//string buffer can insert,update,delete
		
		
	//	| Class           | Mutable  | Thread-Safe  | Synchronized  | Speed                         |
	//	| --------------- | -------  | -----------  | ------------  | ----------------------------- |
	//	| `String`        | ❌ No    | ✅ Yes       | ❌ No         | Fast (read-only)              |
	//	| `StringBuffer`  | ✅ Yes   | ✅ Yes       | ✅ Yes        | Slower than `StringBuilder`   |
	//	| `StringBuilder` | ✅ Yes   | ❌ No        | ❌ No         | Fastest (not safe in threads) |

		
		
		
//				System.out.println(Arrays.toString(a));
//				
//				
//				
//				StringBuilder s= new StringBuilder("Helo");
//				System.out.println(s);
//			    s.insert(2, "l");//---->1
//			    System.out.println(s);
//			    s.replace(1, 5, "hiiiiiiii");//--->2
//			    System.out.println(s);
//			    s.delete(1,5);//----->3
//			    System.out.println(s);
//	}
//
//}
