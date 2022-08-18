import java.util.Scanner;
class  Statusofgrade
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your grade");
		char grade = scan.next().charAt(0);
		if (grade=='A')
		{
			System.out.println("you got first rank");
		}
		else if(grade=='B')
		{
			System.out.println("you got second rank");
		}
		else if(grade=='c')
		{
			System.out.println("you got first class");
		}
		else if(grade=='D')
		{
			System.out.println("you got second class");
		}
		else if(grade=='E')
		{
			System.out.println("just pass");
		}
		else if(grade=='F')
		{
			System.out.println("fail");
		}

	}
}
