import java.util.Scanner;

//Q7. (Geometry: distance of two points) Write a program that prompts the user to enter
//two points (x1, y1) and (x2, y2) and displays their distance between them.

public class Ques16 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double result = Math.sqrt(Math.pow((x2 -x1),2) +Math.pow((y2 -y1), 2));
		System.out.println(result);
		scanner.close();
	}
}
