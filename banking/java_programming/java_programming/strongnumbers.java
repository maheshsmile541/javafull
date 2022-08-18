class strongnumbers 
{
	public static void main(String[] args) 
	{
		int num=145;
		int temp=num;
		int sum=0;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			int factorial=1;
			for (int a=1;a<=lastdigit ;a++ )
			{
				
				factorial=factorial*a;
			}
			sum=sum+factorial;
			num=num/10;
			
		}
		if (sum==temp)
			{
				System.out.println("strong number");
			}
		
		  else 
		   {
				System.out.println("not a strong number");
			}
	}
}
