import java.util.Arrays;

public class Arrayscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {5,7,8,10,2,23,11,12,1,3,6,4,9};
	Arrays.sort(arr1);
	int size=arr1.length/2;
	System.out.print("( ");
	for(int i=0;i<arr1.length;i++) {
		if(size>i) {
		
			System.out.print(arr1[i]+ " ");
			
		}
		
	}

	System.out.print(") ( ");
	for(int i=size;i<=arr1.length;i++) {
		if(arr1.length>i) {
		
			System.out.print(arr1[i]+ " ");
			
		}
	}
	System.out.println(")");
	}
}
