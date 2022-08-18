package Threads.com;
class threadE extends Thread{
	synchronizedBlockDemo r;
	threadE(synchronizedBlockDemo r) {
	this.r=r;
	}
	public  void run() {
		r.print(5);
	}
}
class threadR extends Thread{
	synchronizedBlockDemo r;
	threadR(synchronizedBlockDemo r){
		this.r=r;
	}
 public	void run() {
	 r.print(10);
 }
}
	
public class synchronizedBlockMain {
public static void main(String[] args) {
	synchronizedBlockDemo  S=new synchronizedBlockDemo();
	threadR t6=new threadR(S);
	threadE t7=new threadE(S);
	t6.start();
	t7.start();
}
}
