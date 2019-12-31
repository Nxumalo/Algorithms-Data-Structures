import java.applet.*;
import java.awt.*;

public class EX05C extends Applet {
	
	TextField tf1 = new TextField(25);
	TextField tf2 = new TextField("This is a TextField");
	TextArea ta1 = new TextArea(10,50);
	TextArea ta2 = new TextArea("This is a 10 X 50 TextArea",10,50);
	
	public void init() {
		resize(320,400 );
		tf1.resize(tf1.preferredSize());
		tf1.setEchoCharacter('*');
		add(tf1);
		
		ta1.resize(tf1.preferredSize());
		add(ta1);
		
		tf2.resize(tf2.preferredSize());
		add(tf2);
		
		ta2.resize(ta2.preferredSize());
		add(ta2);
		
		add(new Button("Update"));
	}
	
	public boolean action(Event evt, Object obj) {
		boolean result = false;
		if("Update".equals(obj))
		{
			ta1.appendText(tf1.getText()+"\r\n");
			ta2.insertText(tf2.getText()+"\r\n",0);
			tf1.setText("");
			tf2.setText("");
			result = true;
		
		}
		return result;
	}

}
