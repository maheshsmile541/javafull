package Collections.Java;

public class Q6_FirstRepeatingValues {
public static void main(String[] args) {
	int arr[] = {10, 7, 8, 1, 8, 7, 6};
	int first=0;
	int second=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				second=first;
				first=arr[i];
				break;
		
			}
			else {
			
			}
		
		}
		
	}System.out.println(second);
}
	
}
