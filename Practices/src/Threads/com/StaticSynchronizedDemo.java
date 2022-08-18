package Threads.com;

public class StaticSynchronizedDemo {
synchronized static void Print(int n) {
	for (int i=1;i<=5;i++) {
		System.out.println(i+n);
	}
}
}
