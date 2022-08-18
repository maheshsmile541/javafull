package com.sample.com;

public class MethodOverLoadingexample {
	
	public void numbersAddition(int no1,int no2) {
		
		System.out.print("method 1 "+(no1+no2));
		
	}
	
	public void numbersAddition(int no1,double no2) {
		
		System.out.print("method 3 float  "+(no1+no2));		
	}
	
	public void numbersAddition(int no1,int no2,int no3) {
		
		System.out.print("method 2 "+ (no1+no2+no3));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingexample m1=new MethodOverLoadingexample();
		m1.numbersAddition(1, 2);
		m1.numbersAddition(1, 2123,3);
		m1.numbersAddition(1,1.100000);
		

	}

}
