//Q8. (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
//from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
//separated by exactly one space.

public class Ques39 {

	public static void main(String [] args) {
		System.out.println("Divisible by {5} and {6}\n");
		int counter =0;
		for(int number = 100; number <= 1000; number++) {
			if(isDivisibleBy5or6(number) == true) {
				System.out.print(number + " ");
				counter++;
				while(counter == 10)
				{
					System.out.println("\n");
					counter = 0;
				}
			}
		}
	}
	public static boolean isDivisibleBy5or6(int x) {
			if(x%5==0 && x%6==0) return true;
			else return false;
		}
}
