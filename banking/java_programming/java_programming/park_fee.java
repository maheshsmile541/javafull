import java.util.Scanner;
class  park_fee
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to fees board");
		System.out.println();
		System.out.println("select your group from the below");
		System.out.println();
		System.out.println("group M---male");
		System.out.println("group F----female");
		System.out.println("group T-----transgender");
		System.out.println("group S-----senior citizen");
		System.out.println("group C------children");
		System.out.println();
		System.out.println("select your group");
		char group = scan.next().charAt(0);
		switch (group)
		{
		case 'M':System.out.println("Payble fee is 100");
		break;
		case 'F':System.out.println("Payble fee is 80");
		break;
		case 'T':System.out.println("Payble fee is 50");
		break;
		case 'S':System.out.println("Payble fee is 0");
		break;
		case 'C':System.out.println("Payble fee is 5");
		break;
		default : System.out.println("enter valid input");
		}




	}
}
