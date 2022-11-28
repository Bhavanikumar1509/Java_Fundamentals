package Strings;

public class PerformanceTestBUfferBUilder {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		StringBuffer stringBUffer=new StringBuffer("java");
		for (int i=0;i<100000;i++) {
			stringBUffer.append("Fundamentals");
		}
		System.out.println("performance test(StringBUffer):"+(System.currentTimeMillis()-startTime));
		StringBuilder stringBUilder=new StringBuilder("java");
		for (int i=0;i<100000;i++) {
			stringBUilder.append("Fundamentals");
		}
		System.out.println("performance test(StringBUilder):"+(System.currentTimeMillis()-startTime));
	}

}
