import java.util.Scanner;
class multiplicationscanner
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter table number that you want");
		int num = scan.nextInt();
		for(int a=1;a<=20;a++)
		{
			System.out.println(num+"*"+a+"="+(num*a));
		}
	}

} 
