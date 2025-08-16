import java.util.HashMap;

public class MP {

	public static void main(String[] args) {
          HashMap<Integer,String>map=new HashMap<Integer, String>();
          map.put(1, "apple");
          map.put(2, "banana");
          map.put(3, "lemon");
          map.put(4, "pomogranate");
          map.put(5, "seeds");
          System.out.println(map);
          
          map.put(null, null);
          map.put(null, "123");
          System.out.println(map);
          //get
          System.out.println(map.get(null));
          //remove
          map.remove(5);
          System.out.println(map);
          //contains
          System.out.println(map.containsKey(4));
          System.out.println(map.containsValue("apple"));
          //size
          System.out.println(map.size());
          //keyset
          System.out.println(map.keySet());
          //values
          System.out.println(map.values());
          //entry set
          System.out.println(map.entrySet());
          

	}

}
