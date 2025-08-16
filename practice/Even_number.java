package practice;

public class Even_number{
public static void main(String args[ ]){
	int num=1234;
	int temp=num;
	int rev=0;
	int count=0;
	int sum=0;
	while(num>0){
	int n=num%10;
	rev=(rev*10)+n;
	num=num/10;
	count++;
	sum++;
	}
	System.out.println("Rev number:"+rev);
	System.out.println("Count the number:"+count);
	System.out.println("sum the number:"+sum);
	if(rev==temp) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	}
	}