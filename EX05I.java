import java.applet.*;
import java.awt.*;
public class EX05I extends Applet {
	
	CardLayout layout;
	public void init() {
		resize(320,240);
		layout = new CardLayout();
		setLayout(layout);
		add("Page1",new Button("Go to Page 2"));
		add("Page2",new Button("Go to Page 3"));
		add("Page3",new Button("Go to Page 4"));
		add("Page4",new Button("Go to Page 1"));
	}

	public boolean action(Event evt,Object obj) {
		boolean result = false;
		if("Go to Page 1".equals(obj)) {
			layout.show(this, "Page1");
			result = true;
		}
		
		else if ("Go to Page 2".equals(obj)) {
			layout.next(this);
			result = true;
		}
		else if("Go to Page 3".equals(obj)) {
			layout.show(this, "Page3");
			result = true;
		
		}
		else if("Go to Page 4".equals(obj)) {
				layout.last(this);
				result = true;
			}
		return result;
	
	}
	
	
}
