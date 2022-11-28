package multithreading;
import java.util.*;
import java.io.*;
public class matrix {
	public static int quotient(int[][] a,int n,int p,int q) {
		int result=0;
		int sum=0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;i++) {
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		int s=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==p && j==q) {
					s=a[i][j];
				}
			}
		}
		int sum2=0;
		while(s!=0) {
			sum2+=s%10;
			s=s/10;
			if(s>10) {
				sum2+=s%10;
				s=s/10;
			}
			
		}
		result=result+sum+sum2;
		return result;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[][]=new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;i<n;i++) {
				a[i][j]=sc.nextInt();
		int p,q;
		p=sc.nextInt();
		q=sc.nextInt();
		System.out.println(a[p][q]);
	}

}
}
}
