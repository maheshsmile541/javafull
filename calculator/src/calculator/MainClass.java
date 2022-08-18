package calculator;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a,b;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a, b values:");
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("1.Addition  2.Subtraction  3.Multiplication  4.Division  5.Reminder");
	int option =sc.nextInt();
	sc.close();
	Condition_InterFaceImplement cal= new Condition_InterFaceImplement();
	switch (option) {
	
	case 1 :cal.additon(a, b);
	break;
	case 2 :cal.subtraction(a, b);
	break;
	case 3 :cal.multiplication(a, b);
	break;
	case 4 :cal.division(a, b);
	break;
	case 5 :cal.remainder(a, b);
	break;
	
	}
	}

}
