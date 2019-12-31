import java.applet.*;
import java.awt.*;

public class EX05B extends Applet {
	
	int count = 0;
	Button button2 = new Button("Now Push Me");
	public void init()
	{
		resize(320,240);
		add(new Button("Push me!"));
		button2.disable();
		add(button2);
	}
	
	public boolean action(Event evt,Object obj) {
		boolean result = false;
		if("Push me!".equals(obj)) {
			count++;
			switch(count) {
			case 1:
				button2.setLabel("almost");
				break;
			case 2:
				button2.setLabel("Now push");
				button2.enable();
				break;
			}
			result = true;
		}
		else if ("Now push me".equals(obj)) {
			getGraphics().drawString("Thank you", 20, 60);
			result = true;
		}
		return result;
	}
}
