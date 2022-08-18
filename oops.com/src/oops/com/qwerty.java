package oops.com;

 class person1{
	 private String name,add; // private = restricted access

	  // Getter
	  public String display() {
	    return add;
	    
	   
	  }

	  // Setter
	  public void insert(String newName,String newadd) {
	    this.name = newName;
	    this.add=newadd;
	  }
 }

public class qwerty {
// int x=10;
// qwerty(){
//	 x=23;
//	 
// }
// static void staticmethod() {
//	 System.out.println("static method ");
// }
// public void publicmethod() {
//	 System.out.println("public method");
// }
//public static void main(String[] args) {
////staticmethod();
////publicmethod();
////
////	qwerty as=new qwerty();
////	as.publicmethod();
////	as.staticmethod();
////	
////qwerty as1=new qwerty();
////as1.x=10;
////System.out.println(as.x);
////
////System.out.println(as1.x);
//qwerty m1=new qwerty();
//m1.getClass();
//
//System.out.println(m1);
//
//
////as.x=10;


public static void main(String[] args) {
	person1 m2=new person1();
//	m2.name="jhon";
	//m2.insert("jhon", " sjska");
	//System.out.println(m2.display());
}	  
}
