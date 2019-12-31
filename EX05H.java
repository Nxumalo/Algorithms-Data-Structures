import java.applet.*;
import java.awt.*;

public class EX05H extends Applet{
	
	public void init() {
		setLayout(new BorderLayout());
		
		add("North",new Button("North"));
		add("South",new Button("South"));
		
		add("East",new Button("East"));
		add("West",new Button("West"));
		
		add("Center",new Button("Center"));
		
		resize(320,240);
		
	}

}
