import java.util.Scanner;

//Q4. (Sum the digits in an integer) Write a program that reads an integer between 0 and
//1000 and adds all the digits in the integer. For example, if an integer is 932, the
//sum of all its digits is 14.
//Hint: Use the % operator to extract digits, and use the / operator to remove the
//extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93

public class Ques13 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int total =0;
		if(n>0 && n<=1000) {
		while(n!=0) {
			int temp = n%10;
			n =n/10;
			total = total +temp;
		}
		System.out.println(total);
		}else {
			System.out.println("Please enter a valid number");
		}
		scanner.close();
		}
}
