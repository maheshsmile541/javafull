import java.util.Scanner;
class Marriage
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter male age");
		int a = scan.nextInt();
		System.out.println("enter female age");
		int b = scan.npextInt();
		if(a>=21&&b>=18)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");

        }
 	}
}
