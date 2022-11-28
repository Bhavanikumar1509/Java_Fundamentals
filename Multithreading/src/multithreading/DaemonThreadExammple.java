package multithreading;
class MyDaemonThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("Value:"+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class DaemonThreadExammple {
	public static void main(String[] args) {
		
		Thread mainthread=Thread.currentThread();
		
		Thread childThread=new Thread() {
		public void run() {
			System.out.println("Child thread is running");
		}
		};
		
		//mainthread.setDaemon(true);-->Exception in thread "main" java.lang.IllegalThreadStateException
		childThread.setDaemon(true);
		System.out.println(mainthread.isDaemon());
		System.out.println(childThread.isDaemon());
		
		
		
		
		
		MyDaemonThread t1=new MyDaemonThread();
		Thread thread1=new Thread(t1);
		thread1.setDaemon(true);
		System.out.println(thread1.isDaemon());
	}

}
