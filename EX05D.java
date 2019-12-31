import java.applet.*;
import java.awt.*;
public class EX05D extends Applet {
	
	Label label;
	
	public void init() {
		
		resize(320,240);
		add(new Label("Example EX05D: Labels and Buttons"));
		label = new Label("Social Security Number:",Label.RIGHT);
		add(label);
		add(new TextField(25));
		add(new Button("Change"));
	}
	
	public boolean action(Event evt,Object obj) {
		
		boolean result = false;
		if("Change".equals(obj)) {
			if(label.getText().equals("Name:"))
				label.setText("Social Security Number:");
			else
				label.setText("Name:");
		}
		result = true;
		return result;
	}

}
