package calculator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class collection {



			public static void main(String[] args) {
		       
			   List l=new ArrayList();
		       l.add(2310);
		       l.add(2045.5);
		       l.add("Mahesh");
		       l.add(1087);
		       l.add('R');
		       System.out.println(l);
		       l.remove(3);
		       System.out.println(l);
		       l.add(50);
		       System.out.println(l);
		       l.addAll(l);
		       System.out.println(l);
		       l.removeAll(l);
		       System.out.println();
		       
		       Set s=new HashSet();
		       s.add(2310);
		       s.add(2045.5);
		       s.add("Mahesh");
		       s.add(1087);
		       s.add('R');
		       System.out.println(s);
		      
	
	}

}
