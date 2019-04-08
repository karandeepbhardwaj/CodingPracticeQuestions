import java.util.Scanner;

//5. Write a program to print following pattern?
//Enter nubmer of rows: 5
//
//          *
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *

public class Ques31 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m=1;
		int p=1;
		int a=1;
		int b=1;
		
		for(int i=0; i<n; i++) { //number of rows
			for(int k=n;k>=(i-p); k--) { // spacing
				System.out.print(" ");
			}	
			for(int j=1; j<=(i+m); j++) { //number of columns
				System.out.print("* ");
			}System.out.println();
			m++;
			p--;
		}
		
		for(int i=0; i<n; i++) {
			
			for(int k=1; k<=(i+a); k++) {
				System.out.print(" ");
			}
			for(int j=n; j>=(i-b);j--) {
				System.out.print("* ");
			}
			System.out.println();
			a++;
			b--;
		}
		scanner.close();
	}
}
