package oops.com;
class employee{
	int id;
	String name;
	float salary;
	void insert(int i, String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {System.out.println(id+" "+name+" "+salary);
}
}
public class ObjectAndClassThroughMethod {
public static void main(String[] args) {
	employee e1=new employee();
	employee e2=new employee();
	employee e3=new employee();
	e1.insert(123, "mahesh", 22000);
	e2.insert(124, "raju", 32000);
	e3.insert(125, "krish", 122000);
	e1.display();
	e2.display();
	e3.display();
}
}
