
class SleepThread extends Thread {

		SleepThread()
		{
			super(" New Thread");
			System.out.println("Thread Created"+this);
			start();
		}
		public void run() {
		
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Print Count "+i);
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e) {
				System.out.println("Exception catched");
			}
	}
}

class SleepThreadDemo {

	public static void main(String args[]) {
		SleepThread s=new SleepThread();
		try {
			while(s.isAlive()) {
				System.out.println("Main thread is alive");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Thread is interrupted");
		}
		System.out.println("Thread execution terminated");
	}
}
