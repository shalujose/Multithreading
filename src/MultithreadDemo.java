
public class MultithreadDemo implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is Running");
		}
		catch(Exception e) {
			System.out.println("Exception Catched");
		}
	}	
}

class RunnableDemo{
	public static void main(String[] args) {
		
		int n=8;
		for(int i=0;i<n;i++) {
			Thread t=new Thread(new MultithreadDemo());
			t.start();
		}
	}
}