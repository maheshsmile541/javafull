package oops.com;

class animal{
	void eat() {
		System.out.println("eating ...");
	}
}
class dogs extends animal{
	void bark() {
		System.out.println("backing...");
	}
}
class cats extends dogs{
	void walk() {
		System.out.println("walking....");
	}
}
public class inheriatance {
public static void main(String[] args) {
	dogs d=new dogs();
	cats c=new cats();
	d.bark();
	d.eat();
	c.bark();
	c.walk();
	c.eat();
	
	
}
}
