import java.util.Scanner;

//3. Write a program to print Fibonacci Series?
//Description : Fibonacci series is in the form of 0, 1, 1, 2, 3, 5, 8, 13, 21,...... 
//Hint: To find this series we add two previous terms/digits and get next term/number

public class Ques24 {

	public static void main(String args[]) {
		Scanner scanner =  new Scanner(System.in);
		int limit = scanner.nextInt();
		int previousNumber=0;
		int nextNumber=1;
		
			for(int i =0; i<limit;i++) {
				 System.out.print(previousNumber+" ");
		           	int sum = previousNumber + nextNumber;
		            previousNumber = nextNumber;
		            nextNumber = sum;
		}
		scanner.close();
	}
}