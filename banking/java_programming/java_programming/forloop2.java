import java.util.Scanner;
class forloop2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.next();
		System.out.println("enter how many times");
		int c = scan.nextInt();
		for (int a=1;a<=c ;a++ )
		{
			System.out.println(name);

		}

	}
}
