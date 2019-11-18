
public class MultithreadindExample extends Thread {

	public void run() {
		
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
	}

}

class ExampleDemo{
	public static void main(String args[]) {
	
		MultithreadindExample obj1=new MultithreadindExample();
		obj1.setName("First Thread");
		obj1.setPriority(Thread.MAX_PRIORITY);
		
		MultithreadindExample obj2=new MultithreadindExample();
		obj2.setName("Second Thread");
		obj2.setPriority(Thread.MIN_PRIORITY);
		
		MultithreadindExample obj3=new MultithreadindExample();
		obj3.setName("Third Thread");
		
		obj1.start();
		obj2.start();
		obj3.start();
	}
}