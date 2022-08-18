package Practices;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("enter the number");
		int num=scan.nextInt();
		int sum=0;
		int temp=num;
		int product=1;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit; //6,9
			product=product*lastdigit;//6,24
			num=num/10;
		}
		if (sum==product)
		{
			System.out.println(temp+":is spynumber");
		}
		else
		{
			System.out.println(temp+":not a spynumber");
		}
	

}}
