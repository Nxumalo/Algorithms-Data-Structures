
public class Example2_20 {
	
	public static void main(String[] args) {
		String str;
		int num1,num2;
		num1 = 12;
		num2 = 26;
		str= "The sum = "+num1 +num2;
		System.out.println("Line 4:str: "+str);
		str = "The Sum = "+(num1+num2);
		System.out.println("Line 6:str: "+str);
		str = num1+num2 +" is the sum";
		System.out.println("Line 8:str: "+str);
		str = "The sum of "+num1+" and "+num2+" = "+(num1+num2);
		System.out.println("Line 10:str: "+str);
	}

}
