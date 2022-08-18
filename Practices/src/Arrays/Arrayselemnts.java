package Arrays;

public class Arrayselemnts {
public static void main(String[] args) {
	int arr1[]=new int[6];//size and remaing values index echina values kakunda...
	arr1[0]=6;
	arr1[1]=9;
	arr1[2]=1;
	arr1[3]=3;
	arr1[4]=5;
	for(int i=0;i<arr1.length;i++) {//show array elements used for loop
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	
	for(int x:arr1) {//show array elements used foreach loop
		System.out.println(x);
	}
	
	
int arr[]= {43,54,23,12,654,443};//unlimited values direct input
for(int j=0;j<arr.length;j++) {//show array elements used for loop
	System.out.print(arr[j]+" ");
}
System.out.println();

for(int r:arr) {//show array elements used foreach loop
	System.out.println(r);
}

}
}
