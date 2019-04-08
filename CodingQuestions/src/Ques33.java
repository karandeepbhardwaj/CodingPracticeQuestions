import java.util.Scanner;

//Q2: (Find future dates) Write a program that prompts the user to enter an integer for
//today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
//prompt the user to enter the number of days after today for a future day and display
//the future day of the week.

public class Ques33 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the current day: ");
		
		int day = scanner.nextInt();
		
		System.out.print("Today is ");
		
		switch (day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Please enter a valid number");
			break;
		}
		
		System.out.print("Please enter the number of days elcapsed: ");
		int days = scanner.nextInt();
		
		int futureday = (day + days)%7;
		
		System.out.print("Future day is ");
		
		switch (futureday) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Please enter a valid number");
			break;
		}
		scanner.close();
	}
}
