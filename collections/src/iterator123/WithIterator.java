package iterator123;

import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class WithIterator {
public static void main(String[] args) {
	ArrayList<String> cars=new ArrayList<String>();

	cars.add("valvo");
	cars.add("BMW");
	cars.add("SKODA");
	cars.add("robo");
	cars.add("king");
	cars.add("dell");
	
	//get the iterator
	Iterator<String> item=cars.iterator();
	
	while(item.hasNext()) {
		System.out.println(item.next());
	}

	ArrayList <Integer> n1 =new ArrayList<Integer>();
	
	n1.add(12);
	n1.add(32);
	n1.add(43);
	n1.add(52);
	n1.add(65);
	n1.add(72);
	
	n1.add(90);
	n1.add(232);
	n1.add(15);
	n1.add(13);
	ArrayList <Integer> list1= new ArrayList(); 
	LinkedList <Integer> list2= new LinkedList();
	Stack <Integer> list4= new Stack(); 
	Vector <Integer> list5= new Vector(); 
	
	System.out.println(n1);
	Iterator<Integer> l1=n1.iterator();
	while(l1.hasNext()) {
		Integer i=l1.next();
		
		if(i<30) {
			System.out.print(i+" ");
			l1.remove();
		
		}
		
		
	}
	System.out.println(n1);
}
}
