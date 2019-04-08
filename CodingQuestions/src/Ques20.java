import java.util.Scanner;

//3. Write a java program to swap two variables?

public class Ques20 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("value of a "+a+" value of b "+b);
		 int temp = a;
		 a=b;
		 b=temp;
		 System.out.println("\nAfter swap\nvalue of a "+a+" value of b "+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("\nAfter swap\nvalue of a "+a+" value of b "+b);
		 scanner.close();
	}
}
