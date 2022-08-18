package Collections.Java;

public class Q1_lengthOfStringWithOutUsingMethod {
public static void main(String[] args) {
	String s1="This is java world";
	char[]a=s1.toCharArray();
	int count=0;
	for(char c:a) {
		count++;
		
	}
	System.out.println(count);
}
}
