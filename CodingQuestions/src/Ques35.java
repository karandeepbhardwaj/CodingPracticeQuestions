import java.util.Scanner;

//Q4. (Find the number of days in a month) Write a program that prompts the user
//to enter the month and year and displays the number of days in the month. For
//example, if the user entered month 2 and year 2012, the program should display
//that February 2012 had 29 days. If the user entered month 3 and year 2015, the
//program should display that March 2015 had 31 days.

public class Ques35 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the month: ");
		int month = scanner.nextInt();
		
		System.out.print("Please enter the year now: ");
		int year = scanner.nextInt();
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
		switch (month){
		
		case 1: 
			System.out.println("January " + year + " had 31 days"); 
			break;
		case 2: 
			System.out.println("February " + year + " had" +((leapYear) ? " 29 days" : " 28 days")); 
			break;
		case 3:
			System.out.println("March in "+ year+ " had 31 days");
			break;
		case 4:
			System.out.println("April in "+ year+ " had 30 days");
			break;
		case 5:
			System.out.println("May in "+ year+ " had 31 days");
			break;
		case 6:
			System.out.println("June in "+ year+ " had 30 days");
			break;
		case 7:
			System.out.println("July in "+ year+ " had 31 days");
			break;
		case 8:
			System.out.println("August in "+ year+ " had 31 days");
			break;
		case 9:
			System.out.println("September in "+ year+ " had 30 days");
			break;
		case 10:
			System.out.println("October in "+ year+ " had 31 days");
			break;
		case 11:
			System.out.println("November in "+ year+ " had 30 days");
			break;
		case 12:
			System.out.println("December in "+ year+ " had 31 days");
			break;
		default:
			System.out.println("Please enter a valid number");
			break;
		}
		scanner.close();
	}
}
