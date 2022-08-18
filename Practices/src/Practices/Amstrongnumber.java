package Practices;

public class Amstrongnumber {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=124;
			int num=n;
			int temp=num;
			int count=0;
			int sum=0;
			
			
	        int lastdigit=0;
			while (num!=0)//number length
			{
				count++;
				num=num/10;
			}
		
			num=temp;//123
			while (num!=0)//123!=0
			{
				lastdigit=num%10;//3,2,1
				int exponential=1;//27,
					for (int a=1;a<=count ;a++ )
					{
						exponential=exponential*lastdigit;//3,
						//3+2*3+1*6=15
					}
					sum=sum+exponential;//27+8+1=36
					num=num/10;//12,
			}
			if(sum==n) {
		System.out.println(n+" : Amstrong number");
	}
			else {
				System.out.println(n+ " : Not Amstrong number");
			}

}}
