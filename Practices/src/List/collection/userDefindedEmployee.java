package List.collection;

import java.util.ArrayList;
import java.util.Iterator;

class employee{
	int Em_no,Em_age;
	String eName;
	public employee(int Em_no,String eNAme,int Em_age) {
		this.Em_age=Em_age;
		this.Em_no=Em_no;
		this.eName=eNAme;
}}
public class userDefindedEmployee {

public static void main(String[] args) {

	employee oe1=new employee(123, "mahesh", 22);
	employee oe2=new employee(123432, "Krishna", 23);
	 ArrayList<employee> al=new ArrayList<employee>();
	 al.add(oe1);
	 al.add(oe2);
	 Iterator i=al.iterator();
	 while(i.hasNext()) {
		 employee emp=(employee)i.next();
		 System.out.println(emp.Em_age+" "+emp.Em_no+" "+emp.eName);
	 }
	

	}
}
