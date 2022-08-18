import java.util.Scanner;
class  park_feebyelseif
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
		if (group=='M')
		{
         System.out.println("yours payble fee is 100");
		}
		else if (group=='F')
		{
		 System.out.println("yours payble fee is 80");
		}
		else if (group=='T')
		{
			System.out.println("yours payble fee is 50");
		}
		else if (group=='S')
		{
			System.out.println("yours payble fee 0");
		}
		else if (group=='C')
		{
			System.out.println("yours payble fee is 5");
		}
    }
}