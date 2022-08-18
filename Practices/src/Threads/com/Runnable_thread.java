package Threads.com;
class display{
 public synchronized void wish(String name) {
	for (int b=0;b<5;b++) {
		System.out.println("Good morning");
	}
}
}
 class MyRunnable implements Runnable{
	 display d;
	 MyRunnable(display d){
		 this.d=d;
	 }
		public void run() {
			d.wish("name");
			for(int i =0;i<10;i++) {
				System.out.println("child Thread "+i);
			}
		}
	}
public class Runnable_thread {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
Thread.currentThread().setName("mahesh");
display d1=new display();
d1.wish("vghj");
	System.out.println(Thread.currentThread().getName());


	int a=10;
	long l=a;
	double d=65.89;
	int s=(int)l;
	System.out.println(s);
	//t.start();
	//t.run();
	for(int j=0;j<10;j++) {
		//System.out.println("Main thread "+j);
	}
}
}
