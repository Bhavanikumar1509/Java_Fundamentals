package multithreading;
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<20;i++)
			System.out.println("Thread1 is runnigg...");
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
		
	}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<20;i++)
			System.out.println("Thread2 is Walking!!!!.");
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadTask {
	public static void main(String[] args) {
		Thread1 thread1=new Thread1();
		thread1.start();
		Thread2 thread2=new Thread2();
		thread2.start();
	}

}
