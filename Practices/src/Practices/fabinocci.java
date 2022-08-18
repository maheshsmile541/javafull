package Practices;

import java.util.Scanner;

public class fabinocci {

	public static void main(String[] args) {
	
//	        Scanner sc=new Scanner(System.in);
//	        System.out.println("enter n value");
//	        int n=sc.nextInt();
//	    int count=10;   
//		int first = 0, second = 1, third = 1;
//	       for(int i = 2;i < count;i++){
//	        	
//	            third = first + second;
//	            first = second;
//	            second = third;
//	      System.out.println(third);
//	      }
Scanner sc =new Scanner (System.in);
System.out.println("enter n value");
int n=sc.nextInt();
		
		int first=0;
		int second=1;
	int	third=0;
		for (int i=1;i<n ;i++ )
		{
			first=second;
			second=third;
		
			third=first+second;
			System.out.println(third);
		
		}
		System.out.println(third);
		}
	
	}


