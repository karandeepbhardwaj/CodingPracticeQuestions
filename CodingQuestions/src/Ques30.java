import java.util.Scanner;

//4. Write a program to print following pattern?
//Input : n = 5
//Output: 
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * * 
//        * 

public class Ques30 {

	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=1; i<=n;i++) {
			
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i;j--) {
				System.out.print("* ");
			}System.out.println();
		}
		scanner.close();
	}
}
