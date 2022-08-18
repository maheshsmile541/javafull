package Threads.com;

public class SynchronizedMethodDemo {

	synchronized void print(int n) {
		for (int i=1;i<=5;i++) {
			System.out.println(i+n);
		try {
			Thread.sleep(200);
		}
		catch(Exception e) {
			
		}
		
		}
	}

}
