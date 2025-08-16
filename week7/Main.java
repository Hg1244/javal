package week7;

class parent{
	void show() {
		System.out.println("call your parent");
	}
}

class child extends parent{
	@Override
	void show() {
		super.show();
		System.out.println("call your child");
	}
}


public class Main {

	public static void main(String[] args) {
		parent p=new child();
		p.show();
	}

}
