package nagaraju;

//public class constructor {
//  int x;
//  
//  public constructor(int y) {
//	  x=y;
//  }
//	public static void main(String[] args) {
//		
//		constructor obj=new constructor(5);
//		System.out.println(obj.x);
//	}
//
//}

public class constructor{
	int birthyear;
	String areaname;
	
	public constructor(int year,String name) {
		birthyear=year;
		areaname=name;
		
	}
	

public static void main(String[] args) {
	constructor obj=new constructor(1998,"Khammam");
	System.out.println( obj.birthyear+" "+obj.areaname);
}
}