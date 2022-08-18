class LargeNum
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 15;
		int c = 20;
		int d = 25;
		int e = (a>b)&&(a>c)&&(a>d)?a:(b>c)&&(b>d)?b:(c>d)?c:d;
		System.out.println(e+" large number ");
	}
}