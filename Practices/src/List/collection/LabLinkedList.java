package List.collection;
import java.util.*;

public class LabLinkedList {
public static void main(String[] args) {
	LinkedList<String> l1=new  LinkedList<String>();
	l1.add("java");
	l1.add("C language");
	l1.add("HTML");
	Collections.sort(l1);
	//System.out.println(l1);
	Iterator<String> ir=l1.iterator();
	while(ir.hasNext()) {
	System.out.println(ir.next());
		}
	}
}
