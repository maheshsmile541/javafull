import java.util.Scanner;
class Spynumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("enter the number");
		int num=scan.nextInt();
		int sum=0;
		int temp=num;
		int product=1;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			num=num/10;
		}
		if (sum==product)
		{
			System.out.println(temp+":is spynumber");
		}
		else
		{
			System.out.println(temp+":not a spynumber");
		}
	}
}
