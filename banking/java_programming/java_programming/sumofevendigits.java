class sumofoevendigits
{
	public static void main(String[] args) 
	{
		int num=48956;
		int sum=0;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			if (lastdigit%2==0)
			{
				sum=sum+lastdigit;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}