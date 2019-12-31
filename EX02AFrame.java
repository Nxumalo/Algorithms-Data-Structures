import java.awt.*;

class EX02AFrame extends Frame{

	public EX02AFrame(String str) {
		super(str);
	}
	
	public boolean handleEvent(Event evt) {
		switch(evt.id) {
		case Event.WINDOW_DESTROY:
		dispose();
		System.exit(0);
		return true;
		
		default:
			return super.handleEvent(evt);
		}
	}
}
