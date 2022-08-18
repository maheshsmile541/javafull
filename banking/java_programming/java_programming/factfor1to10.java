class factfor1to10
{
	public static void main(String[] args)
	{
		
		for (int a=1;a<=10 ;a++ )
		{
			int product=1;
			for (int b=1;b<=a ;b++ )
			{ 
				product=product*b;
			}
			System.out.println(a+"!"+ "="+product);
			
          
		}
		
	}
}
