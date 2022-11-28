//package multithreading;
//class FirstThread extends Thread{
//	@Override
//	public void run() {
//		for(int i=0;i<100;i++) {
//			System.out.println("helow from first thread");
//			try {
//				Thread.sleep(1000);
//			}catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//		}
//	}
//}
//
//public class CreatingThreadExampleThree {
//	public static void main(String[] args) throws InterruptedException {
//		FirstThread firstThread=new FirstThread();
//		firstThread.start();
//		for(int i=0;i<100;i++) {
//			System.out.println("main thread..");
//			Thread.sleep(1000);
//		}
//	}
//
//}
