import java.util.Scanner;

//Q6. (Find the highest score) Write a program that prompts the user to enter the number
//of students and each student’s name and score, and finally displays the name
//of the student with the highest score.

public class Ques37 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number is students");
		int numberOfStudents = input.nextInt();
		int scholar = 0;
		String scholarName = "";
		for(int i =0; i<numberOfStudents; i++) {
			System.out.println("Enter the name of the student.");
			String studentName = input.next();
			System.out.println("Enter marks obtained by the student");
			int marks = input.nextInt();
			if(scholar<marks) {
			scholar = marks;
			scholarName = studentName;
			}
		}
		System.out.println("Student with highest marks is\n" + scholarName +" with marks "+ scholar);
		input.close();
	}
}
