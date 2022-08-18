package Threads.com;

class threadEx extends Thread{
	public void run() {
		StaticSynchronizedDemo.Print(15);
	}
}
 class threadEx1 extends Thread{
	public void run() {
		 StaticSynchronizedDemo.Print(120);
	 }
 }

public class StaticSynchronizedMain {
public static void main(String[] args) {
	threadEx t1=new threadEx();
	threadEx1 t2=new threadEx1();
	
	t1.start();
	t2.start();
}
}
