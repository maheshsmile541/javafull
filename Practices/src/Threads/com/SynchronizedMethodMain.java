package Threads.com;

class thread5 extends Thread{
	SynchronizedMethodDemo S;
	thread5(SynchronizedMethodDemo S){
		this.S=S;
		
	}
	public void run() {
		S.print(10);
	}
}

class thread4 extends Thread{
	SynchronizedMethodDemo S;
	thread4(SynchronizedMethodDemo S){
		this.S=S;
	}
	public void run() {
		S.print(100);
	}
}

public class SynchronizedMethodMain {
	public static void main(String[] args) {
		SynchronizedMethodDemo Ts=new SynchronizedMethodDemo();
		thread5 t4=new thread5(Ts);
		thread4 t5=new thread4(Ts);
		t5.start();
		t4.start();
	}

}
