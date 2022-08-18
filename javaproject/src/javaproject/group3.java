package javaproject;

public class group3 {
	int rollno;
	String name;
	int mobileno;
	GroupDetails groupdetails;
	
	public group3(int rollno,String  name,int mobileno,GroupDetails groupdetails) {
		this.rollno=rollno;
		this.mobileno=mobileno;
		this.name=name;
		this.groupdetails=groupdetails;		
	}
	
	void display() {
		System.out.println(rollno + " " + name + "  "+"  "+mobileno+"  "+groupdetails.city+"  "+groupdetails.district);
	}
	
	public static void main(String[] args) {
		GroupDetails gd1=new GroupDetails("hyd","hyd m1");
		System.out.print(gd1);
		
		group3 g1=new group3(1,"a",100,gd1);
		
		g1.display();
	}

}
