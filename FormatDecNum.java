
public class FormatDecNum {

	public static void main(String[] args) {
		double x = 12.674;
		double y = 233.73;
		double z = 42342.9843;
		
		System.out.println("Line 5: Outputting the values of x,y, abd z with two decimal places");
		System.out.printf("Line 5: x =%.2f %n",x);
		System.out.printf("Line 6: y = %.2f %n",y);
		System.out.printf("Line 7: z = %.2f %n", z);
		
		System.out.println("Line 8: Outputting the values of x,y,z with three decimal places");
		System.out.printf("Line 9: x = %.3f %n",x);
		System.out.printf("Line 10: y = %.3f %n", y);
		System.out.printf("Line 11: z = %.3f %n", z);
		
	}
}
