import java.util.Scanner;

//1. Write a program to find factorial?
//Description: Factorial of any number is the product of an integer and all the integers below it for example factorial of 4 is 4! = 4 * 3 * 2 * 1 = 24. 

public class Ques22 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		int temp=1;
		for(int i =n; i>=1; i--) {
			temp= temp*n;
			n--;
		}
		System.out.println(temp);
		scanner.close();
	}
}
