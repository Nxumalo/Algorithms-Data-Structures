import java.applet.*;
import java.awt.*;

public class EX02A extends Applet{
	
	boolean m_fStandAlone = false;
	
	public static void main(String args[]) {
		EX02AFrame frame = new EX02AFrame("EX02A");
		
		frame.show();
		frame.hide();
		frame.resize(frame.insets().left+frame.insets().right+320,
				frame.getInsets().top+frame.insets().bottom+240);
		EX02A applet_EX02A = new EX02A();
		
		frame.add("Center",applet_EX02A);
		applet_EX02A.m_fStandAlone = true;
		applet_EX02A.init();
		applet_EX02A.start();
		frame.show();
		
		
	}
	public EX02A()
	{
		
	}
	
	public String getAppletInfo() {
	return "Name: EX02\r\n"+
		   "Author: Fraser Nxumalo\r\n"+
		   "Created with Microsoft Vissual J++ Version 1.0";
	
	}
	
	public void init() {
		resize(320,240);
	}

	public void destroy() {
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Hello World", 10, 10);
	}
	
	public void start() {
		
	}
	
	public void stop() {
		
	}
}
