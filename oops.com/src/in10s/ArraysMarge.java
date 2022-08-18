package in10s;
import java.util.*;
public class ArraysMarge {
public static void main(String[] args) {
	int arr1[]= {9,2,8,6,4};
	
	int arr2[]= {3,9,5,8,7};
	
	int arr3[]= new int[arr1.length+arr2.length];
	Arrays.sort(arr3);
	for(int i=0;i<arr3.length;i++) {
		if(arr1.length>i) {
			arr3[i]=arr1[i];

		}
		for(int j=0;j<arr2.length;j++) {
			arr3[arr1.length+j]=arr2[j];
		}
	
		System.out.print(arr3[i]+" ");
		
	
	}

	
	
}
}
