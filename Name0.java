import java.util.*;

public class Name0 {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		double height;
		String name;
		
		System.out.print("Enter an integer: ");
		System.out.flush();
		num = console.nextInt();
		System.out.println();
		System.out.println("num: "+num);
		System.out.print("Enter the first name:  ");
		System.out.flush();
		name = console.next();
		System.out.println();
		
		System.out.print("Enter the height: ");
		System.out.flush();
		height = console.nextDouble();
		System.out.println("Name: "+name);
		System.out.println("Height: "+height);
				}

}
