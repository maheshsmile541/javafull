import java.util.Scanner;
class naturalnumbersscan 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the satrting number of natural number");
		int c = scan.nextInt();
		System.out.println("enter the maximum limit of natural number");
		int b = scan.nextInt();
		for (int a=c;a<=b ;a++)
		{
			System.out.println(a);
		}
		
	}
}
