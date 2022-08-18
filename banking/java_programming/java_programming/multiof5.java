import java.util.Scanner;
class multiof5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter min range ");
		int min = scan.nextInt();
		System.out.println("enter max range ");
		int max = scan.nextInt();
		for (int a =min;a<=max;a++ )
		{
			if(a%5==0)
			{
				System.out.println(a);
			}
			
		}


	}
}
