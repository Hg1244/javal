package week4;
import java.util.Arrays;
 
enum subjects{
	ZOOLOGY,
	BOTANY,
	MATHS,
}
public class Ennum {

	public static void main(String[] args) {
		subjects d= subjects.valueOf("ZOOLOGY");
System.out.println(d);
System.out.println(Arrays.toString(subjects.values()));

	}

}
