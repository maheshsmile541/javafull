class prime1to1000
{
	public static void main(String[] args)
	{
		
		for (int a=1;a<=1000 ;a++ )
		{
			int count=0;
			for (int b=1;b<=a ;b++ )
			{
				if (a%b==0)
				{
					count++;
					
				}	
			}
			if (count==10)
			{  
				
			       System.out.println(a);
		    } 
				
	    }
		 -

		
	}
}