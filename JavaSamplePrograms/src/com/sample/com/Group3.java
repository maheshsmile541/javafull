package com.sample.com;

public class Group3 {
	
	int rollno;
	String name;
	int mobileno;
	GroupDetails groupdetails;
	
	public Group3(int rollno,String  name,int mobileno,GroupDetails groupdetails) {
		this.rollno=rollno;
		this.mobileno=mobileno;
		this.name=name;
		this.groupdetails=groupdetails;		
	}
	
	void display() {
		System.out.print(rollno + " " + name + "  "+"  "+mobileno+"  "+groupdetails.city+"  "+groupdetails.district);
	}
	
	public static void main(String[] args) {
		GroupDetails gd1=new GroupDetails("hyd","hyd m1");
		System.out.print(gd1);
		
		Group3 g1=new Group3(1,"a",100,gd1);
		
		g1.display();
	}

}
