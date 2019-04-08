import java.util.Scanner;

//Q7. (Find the two highest scores) Write a program that prompts the user to enter the
//number of students and each student’s name and score, and finally displays the
//student with the highest score and the student with the second-highest score.

public class Ques38 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number is students");
		int numberOfStudents = input.nextInt();
		int scholar = 0;
		int scholar2 =0;
		String scholarName = "";
		String scholar2Name = "";
		for(int i =0; i<numberOfStudents; i++) {
			System.out.println("Enter the name of the student.");
			String studentName = input.next();
			System.out.println("Enter marks obtained by the student");
			int marks = input.nextInt();
			if(scholar<marks) {
			scholar = marks;
			scholarName = studentName;
			}
			if(marks>scholar2 && marks<scholar) {
				scholar2= marks;
				scholar2Name= studentName;
			}
		}
		System.out.println("Student with highest marks is\n" + scholarName +" with "+scholar+" marks ");
		System.out.println("Student with second highest marks is\n" + scholar2Name +" with "+scholar2+" marks ");
		input.close();
	}
}
