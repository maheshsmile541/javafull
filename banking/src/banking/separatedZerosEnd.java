package banking;

public class separatedZerosEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,0,7,9,0,5,0,4};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr[count++]=arr[i];

			//	System.out.print(arr[i]+" ");
			}
		}
	//	System.out.println(count);
		
while(count<arr.length) {
	arr[count++]=0;
	}
for(int j=0;j<arr.length;j++)
	{
	System.out.print(arr[j]+" ");
	}}

}
