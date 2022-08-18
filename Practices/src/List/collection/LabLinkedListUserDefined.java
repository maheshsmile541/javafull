package List.collection;
import java.util.*;
class student{
	int Sno,age;
	String SName;
	public student(int s,String n,int a) {
		// TODO Auto-generated constructor stub
		this.age=a;
		this.SName=n;
		this.Sno=s;
	
	}
}
public class LabLinkedListUserDefined {
public static void main(String[] args) {
	student s1=new student(101,"Kumar",23);
	student s2=new student (102,"Ravi",25);
	student s3=new student (103,"Ramu",23);

	List<student> ls=new LinkedList<student>();
	ls.add(s1);
	ls.add(s2);
	ls.add(s3);
for(student s: ls) {
	System.out.println(s.Sno+" "+s.SName+" "+s.age);
}

	Iterator<student> ir=ls.iterator();
//	while(ir.hasNext()) {
//		student s=(student)ir.next();
//		System.out.println(s.Sno+" "+s.SName+" "+s.age);
//	}

}
}
