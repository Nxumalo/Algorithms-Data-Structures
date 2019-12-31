import java.applet.*;
import java.awt.*;

public class EX05A extends Applet{

	Button myButton;
	
	public void init() {
		
		resize(320,240);
		myButton = new Button("Push me");
		add(myButton);
	}
	
	public boolean action(Event evt,Object obj) {
		boolean result = false;
		if("Push me!".equals(obj)) {
			getGraphics().drawString("You puhshed it!", 20, 20);
			result = true;
		}
		return result;
	}
}
