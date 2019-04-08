import java.util.Scanner;

//Q5. (Find the number of years) Write a program that prompts the user to enter the
//minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
//For simplicity, assume a year has 365 days.

public class Ques14 {

	public static void main(String args[]) {
		Scanner scanner=  new Scanner(System.in);
		int minutes = scanner.nextInt();
		
		int year = minutes / 525600;
		int remainingMinutes = minutes % 525600;
		
		int day = remainingMinutes / 1440;
		int remainingdays  = remainingMinutes%1440;
		
		int hours = remainingdays/24;
		int remainingHours = remainingdays%24;
		
		
		System.out.println(year+" years and " +day+" days " + hours + " hours " + remainingHours + " minutes");
		
		scanner.close();
	}
}
