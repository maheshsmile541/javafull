package arryas1;

public class duplicate_arrays {
	public static void main(String[] args) {
		int arr1[]= {1,2,35,2,1,6,6};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
