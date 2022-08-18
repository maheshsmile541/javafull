package Collections.java1;
import java.util.*;

class OuterClass {
	  int x = 210;

	  static class InnerClass {
	    int y = 125;
	  }
	}

public class InnerClassOuterClass {
	
		  public static void main(String[] args) {
		    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		  //  System.out.println(myInner.y);
		    List<String> l1=new ArrayList<String>();
		 //   l1.add(12);
		    l1.add("Mdhsh");
		   // l1.add(23223);
		    l1.add("Mahsdgyew");
		    l1.add("uejdhsd");
		    l1.add("Mdhsh");	    l1.add("Mdhsh");
		    l1.stream().filter(f->f.startsWith("M")).forEach(System.out::println);
		  }
	}


