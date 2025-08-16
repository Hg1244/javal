package week1;

public class myrunabble implements Runnable{
     public void run( ){
  System.out.println("my thread is running");
}
public static void main (String[] args){
      Thread t=new Thread(new myrunabble( ));
  t.start();
}
}