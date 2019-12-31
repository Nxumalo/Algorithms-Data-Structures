import java.applet.*;
import java.awt.*;

public class EX05F extends Applet{
	
	Choice genderChoice = new Choice();
	List sportList = new List(5,true);
	TextArea results = new TextArea(10,25);
	TextField newSport = new TextField(15);
	
	public void init() {
		add(new Label("Gender: "));
		
		genderChoice.addItem("Male");
		genderChoice.addItem("Female:");
		
		add(genderChoice);
		
		add(new Label("Sport: "));
		sportList.addItem("Swim");
		sportList.addItem("Bike");
		sportList.addItem("Run"); 
		sportList.addItem("Row");
		add(sportList);
		
		add(new Label("New sPort"));
		add(newSport);
		add(new Button("Add"));
		add(new Button("Delete"));
		
		add(new Button("Save"));
		add(results);
		resize(320,240);
		
	}
	public boolean action(Event evt,Object obj) {
		boolean result = false;
		int i;
		if("Save".equals(obj)) {
			results.setText("");
			
			String gender = genderChoice.getSelectedItem();
			results.appendText(gender = "\r\n");
			for(i=0;i<sportList.countItems();i++) {
				if(sportList.isSelected(i))
					results.appendText(sportList.getItem(i)+"\r\n");
			}
			result= true;
		}
		else if("Add".equals(obj)) {
			String sport = newSport.getText();
			if(sport.length()>0) {
				sportList.addItem(sport);
				
			}
		}
		else if("Delete".equals(obj)){
			for(i=sportList.countItems()-1;i>=0;i--) {
				if(sportList.isSelected(i)) {
					sportList.delItem(i);
				}
			}
		}
		return result;
	}

}
