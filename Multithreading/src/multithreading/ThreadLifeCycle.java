package multithreading;
class ThreadA extends Thread{
	@Override
	public void run() {
		System.out.println("This is ThreadA");
		System.out.println();
		System.out.println("Thread  A Priority:"+Thread.currentThread().getPriority());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			}catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		System.out.println("Thread A is complted");
	}
}
class ThreadB extends Thread{
	@Override
	public void run() {
		System.out.println("this is ThreadB..");
		System.out.println("Thread  B Priority:"+Thread.currentThread().getPriority());
		System.out.println();
		for(int i=1;i<=5;i++) {
				System.out.println("thread B:"+i);
		}
		System.out.println("Thread B completed..");
	}
	
}
public class ThreadLifeCycle {
	public static void main(String[] args) {
		System.out.println("main Thread started.");
		//threads are in new state
		ThreadA tA=new ThreadA();
		ThreadB tB=new ThreadB();
		//running thread tA
		tA.setPriority(Thread.MIN_PRIORITY);
		tB.setPriority(Thread.MAX_PRIORITY);
		tA.start();
		tA.yield();
		tB.yield();
//		try {
//			tA.sleep(1000);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		//start thread tB
		tB.start();
		System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
		System.out.println("Main thread is executing");
	}

}
