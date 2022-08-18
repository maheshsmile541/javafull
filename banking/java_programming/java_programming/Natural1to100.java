class Natural1to100 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=100 ;a++ )
		{
			int num=2;
				if (a%num==0)
				{
					System.out.println(a+":"+"even number");
				}
				else
				{
					System.out.println(a+":"+"odd number");
				}
		}
	}
}
