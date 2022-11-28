package multithreading;
class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("My Thread is running..");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}

public class ThreadWithRunnableInterface {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.run();
		Thread thread1=new Thread(t1);
		thread1.start();
		
		for(int i=0;i<20;i++) {
			System.out.println("Main is walking!..");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
