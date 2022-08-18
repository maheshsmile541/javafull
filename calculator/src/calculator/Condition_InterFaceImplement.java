package calculator;

public class Condition_InterFaceImplement {
	void additon (double a, double b) {
		double add= a+b;
		System.out.println("The addition of  a and b is : "+add);
	}
	void subtraction (double a, double b) {
		double sub= a-b;
		System.out.println("The subtraction of  a and b is : "+sub);
	}
	void multiplication (double a, double b) {
		double multi= a*b;
		System.out.println("The multiplication of  a and b is : "+multi);
	}
	void division (double a, double b) {
		double divide= a/b;
		System.out.println("The division of  a and b is : "+divide);
	}
	void remainder (double a, double b) {
		double module= a%b;
		System.out.println("The remainder of  a and b is : "+module);
	}
}
