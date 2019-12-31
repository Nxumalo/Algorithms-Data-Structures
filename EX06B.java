import java.applet.*;
import java.awt.*;

public class EX06B extends Applet{

	public void init() {
		resize(320,240);
		setLayout(new GridLayout(2,2));
		
		Panel p1 = new Panel();
		p1.add(new Button("Panel"));
		add(p1);
		
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());;
		p2.add("North",new Label("This is a panel on a panel"));
		
		Panel subPanel = new Panel();
		subPanel.add(new Label("Name: "));
		subPanel.add(new TextField(8));
		p2.add("South",subPanel);
		add(p2);
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(2,2));
		p3.add(new Button("Panel 3-1"));
		p3.add(new Button("Panel 3-2"));
		p3.add(new Button("Panel 3-3"));
		p3.add(new Button("Panel 3-4"));
		add(p3);
		
		add(new Button("No Panel"));
		
	}
}
