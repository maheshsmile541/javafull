package banking;

import java.util.Scanner;

public class bank_main {
	static void addition (double a, double b){
		double add=a+b;
		System.out.println("a,b values addition is : "+add);
	}
	static void subtraction (double a, double b){
		double sub=a-b;
		System.out.println("a,b values subtraction is : "+sub);
	}
	static void multiplication (double a, double b){
		double multiply=a*b;
		System.out.println("a,b values multiply is : "+multiply);
	}
	static void divide (double a, double b){
		double division=a/b;
		System.out.println("a,b values divide is : "+division);
	}
	static void reminder (double a, double b){
		double remain=a%b;
		System.out.println("a,b values module is : "+remain);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter values a,b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1 addition 2 subtraction 3 multiplication 4 divide 5 reminder");
		int switchcase=sc.nextInt();
		sc.close();
		switch(switchcase) {
		case 1 : addition(a,b);break;
		case 2 : subtraction(a,b);
		break;
		case 3 : multiplication(a,b);
		break;
		case 4 : divide(a,b);
		break;
		case 5 : reminder(a,b);																	
		break;
		
		}
	}

}
