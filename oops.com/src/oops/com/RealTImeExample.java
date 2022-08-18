package oops.com;

class Account{
	int account_no;
	String name;
	float amount;

	void insert(int a_no,String n,float amt) {
		account_no=a_no;
		name=n;
		amount=amt;
	}
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+"deposited");
	}
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("insufficient balance");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"withdrawsuccessfull");
		}
	}
	void checkBalance() {
		System.out.println(amount);
	}
void display() {
	System.out.println(account_no+" "+name+ " "+amount);
}
}
public class RealTImeExample {
public static void main(String[] args) {
	Account c1=new Account();
	c1.insert(134565432, "mahesh", 44000);
	c1.display();
	c1.checkBalance();
	c1.deposit(6000);
	c1.checkBalance();
	c1.withdraw(50000);
	c1.checkBalance();
}
}
