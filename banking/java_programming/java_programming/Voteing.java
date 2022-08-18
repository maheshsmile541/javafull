import java.util.Scanner;
class Voteing 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age");
		int a = scan.nextInt();
		if(a>=18)
		{
			System.out.println("eligible for voteing");
		}
		else
        {
			System.out.println("not eligible for voteing");
		}
	}	}