import java.util.Scanner;

//Q3. (Financial application: calculate tips) Write a program that reads the subtotal
//and the gratuity rate, then computes the gratuity and total. For example, if the
//user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
//as gratuity and $11.5 as total.

public class Ques12 {
	
	public static void main(String args[]) {
		 
		Scanner scanner =  new Scanner(System.in);
		double st = scanner.nextDouble();
		double gr = scanner.nextDouble();
		double g = ((gr/100) *st);
		double total = g+st;
		System.out.println("Gratuity is "+ g);
		System.out.println("total is "+ total);
		scanner.close();
	}

}
