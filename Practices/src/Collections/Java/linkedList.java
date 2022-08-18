package Collections.Java;
import java.util.*;
public class linkedList {
	public static void main(String[] args) {
		
	
LinkedList<Student1> ll=new LinkedList<>();
ll.add(new Student1(34));
Student1 s2 =new Student1(25);
ll.add(s2);
	Iterator itr=ll.iterator();
	while(itr.hasNext()) {

System.out.print(itr.next());
	}
}}
class Student1{
	int rollno;
	Student1(int rollno){
		this.rollno=rollno;
	}
	public String toString() {
		return " "+rollno;
	}
}