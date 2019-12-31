import java.applet.*;
import java.awt.*;

public class EX05E extends Applet{
	
	CheckboxGroup genderGroup = new CheckboxGroup();
	Checkbox runCheckbox = new Checkbox("Run");
	Checkbox bikeCheckbox = new Checkbox("Bike");
	Checkbox swimCheckbox = new Checkbox("Swim");
	Checkbox rowCheckbox = new Checkbox("row");
	Checkbox liftCheckbox = new Checkbox("Weight Lift");
	TextArea results = new TextArea(10,25);
	
	public void init() {
		resize(320,240);
		add(new Label("Gender: "));
		add(new Checkbox("Male",genderGroup,false));
		add(new Checkbox("Female",genderGroup,true));
		
		add(new Label("in your spare time,what sports do you participate in?"));
		add(runCheckbox);
		add(bikeCheckbox);
		add(swimCheckbox);
		add(rowCheckbox);
		add(liftCheckbox);
		add(new Button("RUN"));
		add(results);
	}
	
	public boolean action(Event evt, Object obj) {
		
		boolean result = false;
		
				if("RUN".equals(obj)) {
					results.setText("");
					
					Checkbox currunt = genderGroup.getCurrent();
					
					if(swimCheckbox.getState() == true)
						results.append("Swim\r\n");
					if(bikeCheckbox.getState() == true)
						results.appendText("Bike\r\n");
					if(runCheckbox.getState() == true)
						results.appendText("Run\r\n");
					if(rowCheckbox.getState() == true)
						results.appendText("Row\r\n");
					if(liftCheckbox.getState() == true)
						results.appendText("Weight Lift\r\n");
					
					result = true;
				}
			
		return result;
	}

}
