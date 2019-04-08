import java.util.Scanner;

//2. Write a program to find given number is odd or even?

public class Ques19 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
			if(n%2==0) {
				System.out.println("The number is even");
			}else {
				System.out.println("Number is odd");
			}
		scanner.close();
	}
}
