package week4;
public class THREADS_ extends Thread{
	
	public THREADS_(String name) {
        super(name);
	}
	
	static int i =8;
	@Override
	public void run() {
		{
			
		}
	for (int i = 0; i < 5; i++) {
		
		try {
			Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread());
		}
	}
	public static void main(String[] args) throws InterruptedException {
	
	THREADS_ t= new THREADS_ ("new 0");
    THREADS_ t1=new THREADS_("new 1");
    THREADS_ t2=new THREADS_("new2");
        t.setName("new0");
        t.start();
        t.setPriority(6);
        t.join();
        
        t.setName("new1");
        t1.start();
        t1.setPriority(7);
        t1.join();
       
        t.setName("new2");
        t2.start();
        t2.setPriority(8);
        t2.join();      
  
    System.out.println(Thread.currentThread());
    System.out.println("hi");
    System.out.println(i);
    i++;
    System.out.println(i);
    }		
	}


