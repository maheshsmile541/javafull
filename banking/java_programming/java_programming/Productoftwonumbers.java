import java.util.Scanner;
class Productoftwonumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number");
		int n1 =scan.nextInt();
		System.out.println("enter second number");
		int n2 =scan.nextInt();
		System.out.println("enter third number");
		int n3 =scan.nextInt();
		System.out.println("product of the given three numbers is :"+(n1*n2*n3));

	}
}
