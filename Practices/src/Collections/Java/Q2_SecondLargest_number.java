package Collections.Java;

public class Q2_SecondLargest_number {
public static void main(String[] args) {
	int arr1[]= {12,34,1,32,12,43,112,231,342};
	int largest=0,secondlargest=0;
	for(int i=0;i<arr1.length;i++) {
		 
		if(arr1[i]>largest) {
			secondlargest=largest;
			largest=arr1[i];
		}
		else if(secondlargest<arr1[i]) {
			secondlargest=arr1[i];
		}
		
		
	}
	System.out.println("second largest number : "+secondlargest);
	}
}
