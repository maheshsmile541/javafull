
public class finalPractice {
	public static void main(String[] args) {
//		
////		int[]  x = {120, 200, 0};
////        for(int i = 0; i < x.length; i++){
////                 System.out.print(x[i] + " ");//016 is an octal number, its equivalent decimal number is 14.
////        } 
//		
////		
////		int count = 0;
////		do{
////		  System.out.println("Interviewbit");
////		  count++;
////		} 
////		while(count < 10);
////
//		  int i;
//          for(i = 1; i < 6; i++){ 
//              if(i > 3) continue;
//              System.out.println(i);	
//          	     }
//          System.out.println(i);	
//	
	
//	
//		 int i;
//         for(i = 1; i < 6; i++){ 
//             if(i > 3) {continue;}
//           
//             System.out.println(i);
//         
//         }
//         System.out.println(i);
		
		
		
//		
//		String A="ashcece";
//	int Vcount=0,cCount=0;
//		for(int i=0;i<A.length();i++) {
//			if(A.charAt(i)=='a' || A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u'){
//			Vcount++;
//				
//			}
//			else if(A.charAt(i)>='a' && A.charAt(i)<='z') {
//				cCount++;
//			}
//		}
//		System.out.println(Vcount);
//		System.out.println(cCount);
		
		int num=17;
		
		int n= num; 
		for (int i=1; i<n;i++) {
			int g=n+i,count=0;
			for(int j=1;j<g;j++) {
				if(g%j==0) {
					count++;
				}
				
		}
			if(count==1) {
			System.out.println("high"+g);
			break;
	}
		
			int k=num-i,low=0;
			for(int l=1;l<k;l++) {
				if(k%l==0) {
					low++;
				}
				
				
			}
			
		
			if(low==1) {
				System.out.println("low"+k);
				break;
		}}
	}}
	
	


