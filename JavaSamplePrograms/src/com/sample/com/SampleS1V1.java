package com.sample.com;

public class SampleS1V1 {  // class
	
	int rollno;
	String name;
	
	SampleS1V1(){  // default constructor
		
	}
	
	SampleS1V1 (int rollno,String name){  
		
		int no1=10;
		int no2=20;
		System.out.print("constructor is being used");
		//System.out.print("rollno "+rollno);
		//System.out.print("name "+name);
		this.rollno = rollno;
		this.name=name;				
		
		//System.out.print(no1+no2);								
		
	}
	
	void display() {
		System.out.print(rollno + " " + name + "  ");
	}
	

	public static void main(String[] args) { //
		// TODO Auto-generated method stub
//		SampleS1V1 s1=new SampleS1V1(1,"name"); // s1 is object // parameterized one
//		SampleS1V1 s2=new SampleS1V1(); // s2 is object //default
//		System.out.print("ok");
//		//System.out.print(s1.rollno);
//		//System.out.print(s1.name);
//		//System.out.print(s2.name);
//		//System.out.print(s2.rollno);
//		
//		s1.display();
//		s2.display();
		//return "something";

	}

}

//15thJun
// explote this keyword and try to explore what are usage of this keyword


//class,object,method,data type,constructor,this keyword,loops,single dimensional array,main method
