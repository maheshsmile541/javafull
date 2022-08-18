package Threads.com;
class Mythread extends Thread{
	public void start() {
		super.start();
		System.out.println("no args method");
	}
	public void run(int i) {
		System.out.println("int arg method");
	}
}



public class thredDemo {
	public static void main(String[] args) {
		Mythread t1=new Mythread();
		t1.start();
		System.out.println("mainthread");
	}

}
