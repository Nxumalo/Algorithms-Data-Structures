import java.applet.*;
import java.awt.*;

public class EX05K extends Applet {
	
	public void init() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		Button button = new Button("Top Left");
		layout.setConstraints(button, gbc);
		add(button);
		
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		button = new Button("Top Center");
		layout.setConstraints(button, gbc);
		add(button);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		button = new Button("TOp right");
		layout.setConstraints(button, gbc);
		
		add(button);
		
		gbc.weighty = 1.0;
		button = new Button("Full Row");
		layout.setConstraints(button, gbc);
		add(button);
		
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.weighty = 0.0;
		button = new Button("Tall,Left Side");
		layout.setConstraints(button, gbc);
		add(button);
		
		
		gbc.weighty = 0.0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight =1 ;
		button = new Button("Skinny Wide Button");
		layout.setConstraints(button, gbc);
		add(button);
		
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		button = new Button("Bottom middle");
		layout.setConstraints(button, gbc);
		add(button);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		button = new Button("Bottom right");
		layout.setConstraints(button, gbc);
		add(button);
		
		resize(320,240);
		
		
	}

}
