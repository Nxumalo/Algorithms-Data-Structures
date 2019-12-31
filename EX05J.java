import java.applet.*;
import java.awt.*;

public class EX05J extends Applet {
	
	public void init() {
		resize(320,320);
		
		setLayout(new GridLayout(3,3));
		
		add(new Button("1,1"));
		add(new Button("1,2"));
		add(new Button("1,3"));
		add(new Button("2,1"));
		add(new TextField("This is a Textfield"));
		add(new Button("2,3"));
		add(new Button("3,1"));
		add(new Button("3,2"));
		add(new Button("3,3"));
	}

}
