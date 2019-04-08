import java.util.Scanner;

//2. Write a program to reverse number?
//Description : Reverse number means reverse the position of all digits of any number. For example reverse of 839 is 938. 
//Hint: For this program you need modulus operator concept and while loop, while loop is used for check condition and modulus used for find the remainder.

public class Ques23 {

	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		int temp =0;
		while(n>0) {
			temp= temp*10+(n%10);
			n=n/10;
		}
		System.out.println(temp);
		scanner.close();
	}
}
