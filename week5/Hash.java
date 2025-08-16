package week5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1); // Duplicate, ignored
        a.add(4);
        
        a.add(5);

        System.out.println("Enter a:");
        System.out.println(a);

        System.out.println("Enter contains:");
        System.out.println("Contains 3? " + a.contains(3));
        
        
        

        System.out.println("Enter getClass:");
        System.out.println(a.getClass());

        System.out.println("Enter remove:");
        a.remove(1);
        System.out.println(a);

        System.out.println("Enter a hashset:");
        Set<Integer> a1 = new HashSet<>();
        System.out.println(a1);

        System.out.println("Enter a1:");
        a1.addAll(a);
        System.out.println(a1);

        System.out.println("Enter hash a1:");
        System.out.println("Hash code of a1: " + a1.hashCode());

        System.out.println("Enter remove a1:");
        a1.remove(2);
        System.out.println(a1);

        System.out.println("Enter add a1:");
        a1.add(5);
        System.out.println(a1);

        System.out.println("Enter clear a1:");
        a1.clear();
        System.out.println(a1);

        System.out.println("Enter iterator a1:");
        Iterator<Integer> it = a1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
