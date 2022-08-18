
public class amstrongNumber1 {
public static void main(String[] args) {
	int n=153;
	int r=n;
	int count=0,lastdigit=0;
while(n>0) {
n=n/10;
count++;
}

while(r!=0) {
	r=r%10;
	int add=1;
	for(int i=0;i<count;i++) {
		add=add*r;
	}
	
}

}	
	
}
