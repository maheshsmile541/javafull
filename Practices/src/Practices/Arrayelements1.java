 package Practices;

import java.util.*;

public class Arrayelements1 {
	public static void main(String[] args) {
		
	
	int arr1[]= {2,3,1,2,4,6,7,9,2,19};
	int arr2[]= {2,1,4,3,9,6};
	int arr3[]= new int[10];
	for(int i=0; i<arr2.length;i++) {
		for(int j=0;j<arr1.length;j++) {
			if(arr2[i]==arr1[j]) {
				arr3[j]=arr1[j];
				System.out.print(arr1[j]+" ");
	
			}
		}
	
		
	
	}
	System.out.println(arr3);
		
	
	}
	
	
	
	
	}