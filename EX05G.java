import java.applet.*;
import java.awt.*;

public class EX05G extends Applet{

	Scrollbar scoreBar = new Scrollbar(Scrollbar.HORIZONTAL,72,10,50,120);
	TextField score = new TextField(5);
	
	public void init() {
		resize(320,240);
		add(new Label("Score: "));
		score.setText("72");
		score.setEditable(false);
		add(score);
		add(scoreBar);
	}
	
	public boolean handleEvent(Event evt) {
		boolean result =false;
		int i;
		if(evt.target == scoreBar) {
		int value  = scoreBar.getValue();
		String str = String.valueOf(value);
		score.setText(str);
		result = true;
		}
		return result;
	}
}
