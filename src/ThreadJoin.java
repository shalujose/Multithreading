
public class ThreadJoin extends Thread {
	
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread "+Thread.currentThread().getName());
			}
			catch(InterruptedException e) {
				System.out.println("Exception Catched"+e);
			}
			System.out.println(i);
		}
			
		
	}
}

 class ThreadJoinDemo{
	public static void main(String args[]) {
		
		ThreadJoin t1=new ThreadJoin();
		ThreadJoin t2=new ThreadJoin();
		ThreadJoin t3=new ThreadJoin();
		
		t1.start();
		try {
		System.out.println("Current Thread "+Thread.currentThread().getName());
		t1.join();
		}
		catch(Exception e) {
			System.out.println("Exception catched"+e);
		}
		t2.start();
		try {
			System.out.println("Current Thread "+Thread.currentThread().getName());
			t2.join();
		}
		catch(Exception e) {
			System.out.println("Exception catched"+e);
		}
		t3.start();
	}
}