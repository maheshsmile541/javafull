package oops.com;

class student{
	int id;
	String name;
String address;

	

void records(int i,String n,String a) {
	id=i;
	name=n;
	address=a;
	
}
void display1() { System.out.println(id+" "+name+" "+address);};
}

public class ObjectClassThroughMethod {
public static void main(String[] args) {
	student s1=new student();
	s1.records(1, "mahesh","hyd");
	student s2=new student();
	s2.records(2, "naga","kmm");
	s2.display1();
	s1.display1();
}
	
	
}
