class oddcomp 
{
	public static void main(String[] args) 
	{
		for (int x=1;x<=100 ;x++ )
		{
			int count=0;
			for (int y=1;y<=x;y++)
			{
				if (x%y==0)
				{
					count++;
				}
				
			}
			if (count>2)
				{
					count++;
				}
                 System.out.println(count);
		}
		
	}
}
