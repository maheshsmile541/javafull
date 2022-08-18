class Amstrongnumber 
{
	public static void main(String[] args) 
	{
		int num=370;
		int temp=num;
		int count=0;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		int sum=0;
        int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			int exponential=1;
			for (int a=1;a<=count ;a++ )
			{
				exponential=exponential*lastdigit;
			}
			sum=sum+exponential;
			num=num/10;
		}
		System.out.println(sum);
	}
}
