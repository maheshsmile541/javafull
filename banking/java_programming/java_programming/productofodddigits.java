class productofodddigits
{
	public static void main(String[] args) 
	{
		int num=48956 ;
		int product=1;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			if (lastdigit%2==1)
			{
				product=product*lastdigit;
			}
			num=num/10;
		}
		System.out.println(product);
	}
}

