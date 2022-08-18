class Countthenumberofdigits 
{
	public static void main(String[] args) 
	{
		int num=1234589;
		int count=0;
		while (num!=0)
		{
			count++;
			num=num/10;
			
			
		}
		System.out.println(count);
		
	}
}
