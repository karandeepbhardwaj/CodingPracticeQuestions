import java.util.Scanner;
//Q10. (Find the factors of an integer) Write a program that reads an integer and displays
//all its smallest factors in increasing order. For example, if the input integer is
//120, the output should be as follows: 2, 2, 2, 3, 5.

public class Ques41 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number ");
		int number  =  sc.nextInt();
		int index = 2;
		
		while(number/index!=1) {
			if(number%index==0) {
				System.out.print(index+",");
				number=number/index;
			}else
				index++;
		}
		System.out.println(number+".");
		sc.close();
	}
}