package Practices;

import java.util.Scanner;

public class practiceScanner {
	public static void main(String[] args) {
		int a=123;
		String b="qwerty";
		
		//int a1=Sc.nextInt();
//		String b1=Sc.next();
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a1);
//		System.out.println(b1);	
		
		
	int n=5;
	for(int i=0;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("&"+" ");
		}
		System.out.println();
		
	}
		
	
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter input pttern size");

		int n1=Sc.nextInt();
		for(int k=0;k<=n1;k++) {
			for(int j=1;j<=k;j++) {
				System.out.print("&"+" ");
			}
			System.out.println();
	}
	}


}