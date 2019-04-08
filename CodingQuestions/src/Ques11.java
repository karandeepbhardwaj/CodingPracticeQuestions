import java.util.Scanner;

//Q2: (Compute the volume of a cylinder) Write a program that reads in the radius
//and length of a cylinder and computes the area and volume using the following
//formulas:
//area = radius * radius * pi
//volume = area * length

public class Ques11 {
	public static void main(String args[]) {
		Scanner scanner =  new Scanner(System.in);
		double r = scanner.nextDouble();
		double l = scanner.nextDouble();
		
		System.out.println("area is "+ (r*r*3.14));
		System.out.println("perimeter is "+ (r*r*3.14*l));
		scanner.close();
	}
}
