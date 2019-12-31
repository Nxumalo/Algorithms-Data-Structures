import javax.swing.JOptionPane;

public class AreaAndCircumferenceProgram {
	
	public static final double PI=3.14;
	
	public static void main(String [] args) {
		
		double radius;
		double area;
		double circumference;
		String radiusString;
		String outputStr;
		
		radiusString = JOptionPane.showInputDialog("Enter the radius: ");
		radius = Double.parseDouble(radiusString);
		area = PI*radius*radius;
		circumference = 2*PI*radius;
		
		outputStr = "Radius "+radius+"\n"+"Circumference: "+circumference+" units";
		
		JOptionPane.showMessageDialog(null,outputStr,"Circle",JOptionPane.INFORMATION_MESSAGE);
	}

}
