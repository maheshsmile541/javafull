package Collections.Java;
import java.util.*;
class student{
int rollno;
String name,address;


//
student (int rollno,String name,String address){
	this.rollno=rollno; 
	
	this.name=name;
	this.address=address;
	
}

}
public class collectionDemo {
public static void main(String[] args) {
	List <student> l1=new ArrayList<>();
	student s1=new student(1,"mahesh","hyd");
	student s2=new student(2,"nagaraju","kmm");
	student s3=new student(3,"krish","mdr");
	student s4=new student(4,"prabhu","vijayawada");
	l1.add(s1);
	l1.add(s2);
	l1.add(s3);
	l1.add(s4);
	for(student s:l1) {
		System.out.println(s.rollno+" "+s.name+" " +s.address);
	}
	
}
}
