class factofgivennumber 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int lastdigit=0;
		int num=569;
		while (num!=0)
		{
			lastdigit=num%10;
			for (a=num;a<=num ;a++ )
			{
				if (num%a)
				{
					sum=sum+a;
				}
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}
