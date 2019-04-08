import java.util.Scanner;

//2. Write a program to check the given number is palindrome or not?
//Descritpion : A Palindrome number is a number that remains the same when
//its digits are reversed. Like 16461, for example: we take 121 and reverse it, after revers it is same as original number.

public class Ques28 {

	public static void main(String args[]) {
		
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		int verify = n;
		while(n>0) {
			result = (result*10)+n%10;
			n=n/10;
		}
		if(result == verify) {
			System.out.println("Is a palindrome.");
		}else {
			System.out.println("Not a palidrome.");
		}
		scanner.close();
	}
}
