import java.util.Scanner;

//5. Write a program to Find Largest Number Among Three Numbers
//Input three number from user and compare these number with each others and find largest number among these three numbers. 

public class Ques26 {
	
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int max=0;
		
		if(num1>num2) {
			max=num1;
		}
		else {
			max=num2;
		}
		if(max>num3) {
			System.out.println(max);
		}else {
			System.out.println(num3);
		}
	
	scanner.close();
	}
}