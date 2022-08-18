class Lcm 
{
	public static void main(String[] args) 
	{
		int n1=3;
		int n2=9;
		int lcm=0;
		for (int a=n1;a<=(n1*n2) ; a++)
		{
			if (a%n1==0&&a%n2==0)
			{
				lcm=a;
				break;
			}
		}
		System.out.println(lcm);
	}
}
