class Countoddcomposite 
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int x=2;x<=100 ;x++ )
		{
          for (int y=2;y<=x ;y++ )
          {
			  if (x%y==0)
			  {
				  if (x==y)
				  {
					  break;
				  }
				  if (x!=y)
				  {
					  if (x%2==1)
					  {
						  count++;
						  System.out.println(x+"->"+count);

					  }
					  break;

				  }
			  }
          }
		}
		System.out.println("total number of odd composite numbers is:"+count);

	}
}
