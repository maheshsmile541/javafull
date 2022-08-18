class Armstrongnumber 
{
	public static void main(String[] args) 
	{
		int num=153;
		int temp=num;
		int count=0;
		while (num!=0)
		{
			count++;
			num=num/10;

		}
		num=temp;
		int lastdigit=0;
		int sum=0;
		while (num!=0)
		{
			int exponential=1;
			lastdigit=num%10;
			for (int a=1;a<=count ;a++ )
			{
				exponential=exponential*lastdigit;

			}
			
			sum=sum+exponential;
			num=num/10;
		}
		if (sum==temp)
		{
			System.out.println(temp+": is armstrong number");
		}
		else
		{
			System.out.println(temp+": is not armstrong number");
		}
	}
}
