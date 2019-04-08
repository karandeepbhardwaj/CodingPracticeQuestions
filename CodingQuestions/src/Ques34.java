import java.util.Scanner;

//Q3:(Sort three integers) Write a program that prompts the user to enter three integers
//and display the integers in non-decreasing order.

public class Ques34 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter three digits : ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();

		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		if (number2 > number3) {
			int temp = number2;
			number2 = number3;
			number3 = temp;
		}

		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.println("Sorted numbers are "+ number1 + " "+ number2 + " "+ number3);
		scanner.close();
	}

}
