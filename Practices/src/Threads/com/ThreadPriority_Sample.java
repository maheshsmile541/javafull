package Threads.com;


public class ThreadPriority_Sample extends Thread {

	public void run(){
		System.out.println("Running Thread");
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadPriority_Sample s1=new ThreadPriority_Sample();
ThreadPriority_Sample s2=new ThreadPriority_Sample();
s1.setPriority(Thread.MAX_PRIORITY);
s2.setPriority(MIN_PRIORITY);
s1.start();
s2.start();

	}

}
