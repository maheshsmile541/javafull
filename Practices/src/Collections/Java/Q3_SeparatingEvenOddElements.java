package Collections.Java;

public class Q3_SeparatingEvenOddElements {
public static void main(String[] args) {

int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
 int even=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.print(  arr[i]+" ");
	}
	
}
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==1) {
		System.out.print(  arr[i]+" ");
	}
	
}
}
}
