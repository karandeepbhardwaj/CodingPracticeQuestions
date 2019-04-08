import java.util.Scanner;
//1. Find largest number among three numbers using ternary operator?

public class Ques27 {
	
	public static void main(String args[]) {
		Scanner scanner =  new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
				 
		int max = (num1>num2)? num1:num2;
		max = (max>num3)?max:num3;
		System.out.println(max);
	
		scanner.close();
}
}