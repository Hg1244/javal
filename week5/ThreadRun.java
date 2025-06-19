package week5;
public class ThreadRun implements Runnable {
  static int i=5;//--->i=5
	public static void main(String[] args) {
		
		ThreadRun t=new ThreadRun();
		Thread th=new Thread(t);
		Thread th1=new Thread(t);
		th.start();
		th1.start();
		System.out.println(i);
		i++;//--->5+1=6
		System.out.println(i) ;
	}

	@Override
	public void run() {
	i++;	//---->6+1=7  and also main method 1=8   //op:5&8
	}
}
