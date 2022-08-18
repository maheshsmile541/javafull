class sumoffactofgivennumbers 
{
	public static void main(String[] args) 
	{
		int num=123456789;
		int sum=0;
		int lastdigit=0;
		int factorial=1;
		while (num!=0)
		{
		    
			 -factorial=1;
			lastdigit=num%10;
			for(int a=lastdigit;a>=1;a--)
			{
				factorial=factorial*a;
				
			}
			sum=sum+factorial;
			num=num/10;

		}
		System.out.println(sum);
	}
}
