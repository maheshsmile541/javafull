import java.util.Scanner;
class forloop 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.next();
		for ( int a=1;a<=10 ;a++ )
		{
			System.out.println(name);
		}
	}
}
