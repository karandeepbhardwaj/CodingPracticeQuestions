import java.util.Scanner;

//3. Write a program to print star pattern?
//Input n= 5;
//Output:  
//		  *
//       * *
//      * * *
//     * * * *
//    * * * * *

public class Ques29 {

	public static void main(String args[])
    {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) { //number of rows
			
			for(int k=(n-1);k>=i;k--) { // spacing
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) { //number of columns
				System.out.print("* ");
			}System.out.println();
		}
		scanner.close();
    }	
}