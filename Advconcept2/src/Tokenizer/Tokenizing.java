package Tokenizer;
import java.util.*;
public class Tokenizing {
	public static void main(String[] args) {
		StringTokenizer message=new StringTokenizer("Learning,java,fundamentals",",",true);
		int count=message.countTokens();
		for(int i=0;i<count;i++) {
			System.out.println("TOken at"+i+":"+message.nextToken());
		}
	}

}
