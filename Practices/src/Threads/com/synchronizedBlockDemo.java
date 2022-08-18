package Threads.com;

public class synchronizedBlockDemo {
	
	void print(int n) {
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
			try{
			Thread.sleep(200);	
			}
			catch(Exception e) {
				
			}
			}
		} 
	}

}
