import java.util.Scanner;

//5. Write a program to check the given number is prime or not?
public class Ques21 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count=0;
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("The number is a prime number.");
		}else {
			System.out.println("The number is not a prime number.");
		}
		scanner.close();
	}
}