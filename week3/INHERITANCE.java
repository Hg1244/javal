package week3;

class Animal {
	void eat() {
		System.out.println("ANIMAL EATS");
	}
}
class Dog extends  Animal{
	void sound() {
		System.out.println("DOG BARKS");
	}
}
public class INHERITANCE {
	public static void main(String []args) {
		Dog d=new Dog();
		d.eat();
		d.sound();
		
	}

}
