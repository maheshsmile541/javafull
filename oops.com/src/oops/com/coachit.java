package oops.com;
class student23{
int id;
String name;
String add;

void insert(int i,String n) {
	id=i;
	name=n;
}
void mahesh(int r,String k,String ad) {
	id=r;
	name=k;
	add=ad;
	
}
void display() {
	System.out.println(id+" "+name+" "+add);
}
}
public class coachit {
public static void main(String[] args) {
	student23 s1=new student23();
	student23 s2=new student23();
	s1.insert(12, "krish");
	s2.mahesh(1231, "qwer","mdr");
	s1.insert(0, null);
	s1.mahesh(0, null, null);
s1.display();
s2.display();
}
}
