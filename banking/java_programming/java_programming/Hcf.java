import java.util.Scanner;
class Hcf 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int hcf=0;
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		int b=scan.nextInt();
		for (int i=1;i<=b ;i++ )
		{
			if (a%i==0&&b%i==0)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
		
	}
}
