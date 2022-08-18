package Practices;

public class amstrong_number {
public static void main(String[] args) {
	int n=153;
	int num=n;
	
	 int count=0;
	 int sum=0;
	 int lastdigit=0;
	while (num!=0) {
			num=num/10;
			count=count+1;
	}
	
	int temp=n;
	
	while(temp!=0) {
		int essentional=1;
		lastdigit=temp%10;
		for(int i=0; i<=count;i++) {
			essentional=lastdigit*essentional;
			
		}
		sum=sum+essentional;
		temp=temp/10;
	}
System.out.println(sum);
}
}
