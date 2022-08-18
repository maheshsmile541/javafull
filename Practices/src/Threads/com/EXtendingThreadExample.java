package Threads.com;

class thread1 extends Thread{
	public void run() {
		System.out.println("Thread 1 started");
	for(int i=1;i<=20;i++) {
		System.out.println("Thread1 : "+i);
		if(i==5) {
			stop();
			}
	}
	
	}
}
class thread2 extends Thread{
	public void run() {
		System.out.println("Thread 2 started");
		for(int i=1;i<=20;i++) {
			System.out.println("Thread2 : " + i);
		if (i==10)
			stop();
		}
	}
}

public class EXtendingThreadExample {
	public static void main(String[] args) {
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
	}

}
