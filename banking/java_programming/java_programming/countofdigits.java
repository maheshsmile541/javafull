import java.util.Scanner;
class countofdigits 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		int count=0;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
	}
}
