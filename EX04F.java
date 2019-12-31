import java.applet.*;
import java.awt.*;

public class EX04F extends Applet {
	
	private String message = "";
	private int xPos = 10;
	private int yPos = 10;
	
	public void init() {
		String param;
		
		param = getParameter("message");
		if(param !=null)
			message = param;
		param = getParameter("xPos");
		if(param !=null)
			xPos = Integer.parseInt(param);
		param = getParameter("yPos");
		if(param != null)
			yPos = Integer.parseInt(param);
		resize(320,240);
		
				
	}
	public void paint(Graphics g) {
		g.drawString(message, xPos, yPos);
	}

}
