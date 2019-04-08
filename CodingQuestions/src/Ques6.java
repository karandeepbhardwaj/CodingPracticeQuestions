import java.text.DecimalFormat;

public class Ques6 {
	
	public static void main(String [] args) {
		
		double width = 4.5;
		double height = 7.9;
		DecimalFormat df2 = new DecimalFormat(".##");
		System.out.println("Area is "+ df2.format(width*height));
	}

}
