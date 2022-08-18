package Practices;

public class StringsMethods {
public static void main(String[] args) {
	String str=new String ("  RedDY ");
	String str1=new String ("     MAHESH RAMESH SURESH NARESH NAGARAJU      ");

	System.out.println(str.length());
	System.out.println(str.indexOf("D"));
	System.out.println(str.charAt(3));
	System.out.println(str.replace("123459", "ashdhs"));
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.compareTo(str1));
	System.out.println(str1.trim());
	System.out.println(str.concat(str1));
}

}
