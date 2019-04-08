import java.util.Scanner;

//Q1: (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
//a double value from the console, then converts it to Fahrenheit and displays the
//result. The formula for the conversion is as follows:
//fahrenheit = (9 / 5) * celsius + 32

public class Ques10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of celcius ?");
		double c = sc.nextDouble();
		double f = (c*(9d/5)) +32;
		System.out.println("Value in farenhiet = "+f);
		sc.close();
	}
}
