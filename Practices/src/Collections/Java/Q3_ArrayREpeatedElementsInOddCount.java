package Collections.Java;

public class Q3_ArrayREpeatedElementsInOddCount {
public static void main(String[] args) {
	int arr1[]= {20,20,30,40,20,30,40,50,20,40,40};
int count=0;
for(int i=0;i<arr1.length;i++) {
	count=count^arr1[i];
	
}
System.out.println(count);

}
}
