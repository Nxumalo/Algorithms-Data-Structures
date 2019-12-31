import java.applet.*;
import java.awt.*;

public class EX06C extends Applet {
	CardLayout layout;
	public void init() {
	resize(320,240);
	layout= new CardLayout();
	setLayout(layout);
	
	Panel panel1 = new Panel();
	panel1.setLayout(new BorderLayout());
	panel1.add("North",new Label("This is page 1"));
	panel1.add("Center", new Button("Go to page 2"));
	panel1.add("South",new Label("This enter card is a panel."));
	add("Page1",panel1);
	
	Panel panel2 = new Panel();
	panel2.setLayout(new BorderLayout());
	panel2.add("North",new Label("This is page 2"));
	panel2.add("Center", new Button("Go to page 3"));
	add("Page2",panel2);

	Panel panel3 = new Panel();
	panel3.setLayout(new BorderLayout());
	panel3.add("North",new Label("This is page 3"));
	panel3.add("Center", new Button("Go to page 4"));
	add("Page3",panel3);

	Panel panel4 = new Panel();
	panel4.setLayout(new BorderLayout());
	panel4.add("North",new Label("This is page 4"));
	panel4.add("Center", new Button("Go to page 1"));
	add("Page4",panel4);



	}
	
	public boolean action(Event evt, Object obj) {
		boolean result = false;
		if("Go to Page 1".equals(obj)) {
			layout.show(this, "Page1");
			result = true;
		}
		else if("Go to Page 2".equals(obj)) {
			layout.show(this, "Page2");
			result = true;
		}
		else if("Go to Page 3".equals(obj)) {
			layout.show(this, "Page3");
			result = true;
		}
		else if("Go to Page 4".equals(obj)) {
			layout.show(this, "Page4");
			result = true;
		}
		return result;
	}
}
