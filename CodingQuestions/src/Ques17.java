//Q8: (Print a table) Write a program that displays the following table. Cast floatingpoint
//numbers into integers.
//a 		b 		pow(a, b)
//1 		2 		1
//2 		3 		8
//3 		4 		81
//4 		5 		1024
//5 		6 		15625s

public class Ques17 {
	
	public static void main(String args[]) {
		
		System.out.println("a\tb\tpow(a, b)"
				+"\n1\t2\t"+(int)Math.pow(1, 2)
				+"\n2\t3\t"+(int)Math.pow(2, 3)
				+"\n3\t4\t"+(int)Math.pow(3, 4)
				+"\n4\t5\t"+(int)Math.pow(4, 5)
				+"\n5\t6\t"+(int)Math.pow(5, 6)+"s");
	}

}
