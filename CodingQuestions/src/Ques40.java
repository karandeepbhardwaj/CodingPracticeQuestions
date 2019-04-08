//Q9. (Find the largest n such that n^3 < 12,000) Use a while loop to find the largest
//integer n such that n^3 is less than 12,000.

public class Ques40 {

	public static void main(String[] args) {
		int count=0;
		while(Math.pow(count+1, 3)<12000){
			count++;
		}
		System.out.println("The largest number with cube less than 12000 is "+ count);
	}
}