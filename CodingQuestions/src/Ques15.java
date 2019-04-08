import java.util.Scanner;

//Q6: (Health application: computing BMI) Body Mass Index (BMI) is a measure of
//health on weight. It can be calculated by taking your weight in kilograms and
//dividing by the square of your height in meters. Write a program that prompts the
//user to enter a weight in pounds and height in inches and displays the BMI. Note
//that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

public class Ques15 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 double weight = sc.nextDouble();
		 double height = sc.nextDouble();
		 
		 final double KILOGRAMS_PER_POUND = 0.45359237;
		 final double METERS_PER_INCH = 0.0254;
		 weight = weight * KILOGRAMS_PER_POUND;
		 height = height * METERS_PER_INCH;
		 double bodyMassIndex = weight / Math.pow(height, 2);
		 
		 System.out.println("BMI for you is "+ bodyMassIndex);
		 sc.close();
	}
}
