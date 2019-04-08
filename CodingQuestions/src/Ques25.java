import java.util.Scanner;

//4.Write a program to check given number is Armstrong number or not?
//Description: Armstrong number is a number that is the sum of its own 
//digits each raised to the power of the number of digits is equal to the number itself.
//For example: 
//Three Digits Armstrong number is 153, 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153 
//Four Digits Armstrong number is 1634, 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 + = 1634

public class Ques25 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int count=0;
		int result=0;
		int verify=number;
		
		while(number>0) {
			number=number/10;
			++count;
		}
		number=verify;
		while(number>0) {
			int temp=number%10;
			int temp2 =(int) Math.pow(temp, count);
			result =result+temp2;
			number = number/10;
		}
		if(result==verify) {
			System.out.println(result+"It is an armstrong number.");
		}else {
			System.out.println("It is not an armstrong number.");
		}scanner.close();
	}
}