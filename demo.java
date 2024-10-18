class Demo implements Runnable{
	
	Thread t;
	String threadName;
	Demo(String name){
		threadName=name;
		System.out.println("Creating "+threadName);
		t=new Thread(this.name);
		System.out.println("New THread Nmae:"+t);
		t.start();
	}
	public void run(){
		System.out.println("running"+threadName);
		try{
			for(int i=4;i>0;i--){
				System.out.println("Thread :" + threadName+"  "+i);
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread "+threadName+"interrupted..");
		}
		System.out.println("Thread"+threadName+"exiting");
	}
}
public class TestThread{
  public static void main(String argsp[]){
         Demo d=new Demo("Thread--1");
		 Demo d2=new Demo("Thread--2");
		 try{
			 Thread.sleep(1500);
		 }
		 catch(InterruptedException e){
			 System.out.println("Interupted");
		 }
		 System.out.println("Main Thread is exiting");
  }	  


}