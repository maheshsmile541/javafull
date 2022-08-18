import java.util.Scanner;
import java.util.Scanner;
class factoresofgivennumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter factores of number that you want");
		int num = scan.nextInt();
		for (int a =1;a<=num;a++ )
		{
			if(num%a==0)
			{
				System.out.println(a);
			}
			
		}


	}
}