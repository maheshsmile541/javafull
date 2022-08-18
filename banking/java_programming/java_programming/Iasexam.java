import java.util.Scanner;
class  Iasexam
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your age");
		int age = scan.nextInt();
		if(age>=1&&age<=32)
		{
			System.out.println("eligible");
        }
		else
		{
			System.out.println("not eligible");
		}
	}
}
