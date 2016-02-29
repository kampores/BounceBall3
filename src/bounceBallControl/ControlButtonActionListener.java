package bounceBallControl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButtonActionListener implements ActionListener{
	
	private BounceBallController 	bounceBallController 	= null;
	
	public ControlButtonActionListener(BounceBallController bounceBallController) {
		// TODO Auto-generated constructor stub
		this.bounceBallController = bounceBallController;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String buttonName = e.getActionCommand();
		bounceBallController.buttonActionPerformed(buttonName);
	}
}
