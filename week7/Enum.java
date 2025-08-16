package week7;

import java.util.Arrays;

enum berth{
	UPPER,
	MIDDLE,
	LOWER
}
public class Enum {
 public static void main(String[] args) {
		berth b=berth.LOWER;
		System.out.println(b);
		System.out.println(Arrays.toString(berth.values()));
	}
}
