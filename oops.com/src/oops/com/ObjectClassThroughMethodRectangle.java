package oops.com;

class Rectangle{
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
	}
	void calculateArea() {
		System.out.println(length*width);
	}
}

public class ObjectClassThroughMethodRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1=new Rectangle(),r2=new Rectangle(),r3=new Rectangle();
		r1.insert(11, 5);
		r2.insert(3, 15);
		r3.insert(10, 5);
		r1.calculateArea();
		r2.calculateArea();
		r3.calculateArea();
	}

}
