import java.util.Scanner;
class Grade 
{
	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);

		System.out.println("enter your marks");
		int marks = scan.nextInt();
		if(marks>=90&&marks<=100)
		{
			System.out.println("you got A grade");
		}
		else if(marks>=80&&marks<=89)
		{
			System.out.println("you got b grade ");
		}
		 
	}
}
