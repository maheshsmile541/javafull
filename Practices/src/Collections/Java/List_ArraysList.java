package Collections.Java;
import java.util.*;
public class List_ArraysList {
public static void main(String[] args) {
//	 List_ArraysList cd=new  List_ArraysList();//this is object
	List  cd=new ArrayList();//collection
cd.add(2);
cd.add("wewe");
cd.add("sasa2");
cd.add(1.434);
cd.add(0, 456);

//cd.clear();//clear delete in values
//System.out.println(cd);


List<String> c=new ArrayList<>();
c.add("2344");
c.add("sddfdsf");
c.add("dfd");

//System.out.println(c);


List<String> c1=new ArrayList<String>();
c1.add("4shdh3jdhs");
c1.add("sddfdssdsaw2w22f");
c1.add("dfd3d3");
//
//		
//		for(String s:c1) {
//			//System.out.println(s);
//		}
//						
//				for(int i=0;i<c1.size();i++) {
//					//System.out.println(c1.get(i));//get means specified index value
//				}
//				//System.out.println(c1);
//
//ListIterator<String> i=c1.listIterator();
//System.out.println("in forword direction");
//while(i.hasNext()) {
//	System.out.println(i.next());
//}
//System.out.println(""+ ""+ "");
//
//
//while(i.hasPrevious()) {
//	System.out.println(i.previous());
//// }
//Iterator i1=c1.iterator();
//while(i1.hasNext()) {
//	System.out.println(i1.next());
//}


//
//Iterator<String> itr=c1.iterator();
//c1.clear();
//
//itr.forEachRemaining(a->{
//System.out.println(a);
//
//});
//
//
//List<String> a1=new ArrayList<>();
//System.out.println(a1);
//a1.add("sjdhjdfdhds");
//a1.add("djfhuifuufewee");
//a1.add("jhdfuuew");
//a1.add(2,"112222");
//
//a1.clear();
//
//List<String> a11=new ArrayList<>();
////System.out.println(a1);
//a11.add("s11111ds");
//a11.add("11112e");
//a11.add("3333uew");
//a11.add(2,"66666");
//
//a11.addAll(a1);
//
//for(String q:a11) {
//	System.out.println(q);
//}
////for(String q:a1.h)
//
//
//
//
List  l1=new ArrayList<>();
l1.add("121");
l1.add("12345");
l1.add("2737");
l1.add("skjd");
System.out.println(l1);
List  l2=new ArrayList<>();
l2.add("121");
l2.add("12345");
l2.add("2737");
l2.add("skjd");
l1.sort(Comparator.naturalOrder());
l2.remove(0);
//l2.remove(234);// 234 unte remove avuthndhi
//System.out.println(l1.equals(l2));
//System.out.println(l1.indexOf(2737));
//System.out.println(l1.lastIndexOf(l2));
l1.set(1, "122777");
System.out.println(l1);
System.out.println();
System.out.println(l1);
//System.out.println(l1.contains(2737));//undho ledho checking
System.out.println(l1.subList(1, 3));

}
}
