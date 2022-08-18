package javaproject;

public class MethodOverLoadingexample {
void numbersaddition(int no1,int no2) {
		
		System.out.print("method 1 "+(no1+no2));
		
	}
	
	
void numbersAddition(int no1,double no2) {
		
		System.out.print("method 3 double  "+(no1+no2));		
	}
	
void numbersADdition(int no1,int no2,int no3) {
		
		System.out.print("method 2 "+ (no1+no2+no3));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingexample m1=new MethodOverLoadingexample();
		m1.numbersaddition(1, 2);
		m1.numbersADdition(1, 2,3);
		m1.numbersAddition(1,1.100000);
		

	}
}
