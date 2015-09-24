package bounceBallControl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bounceBallModel.BounceBallManager;
import bounceBallView.BounceBallControlPanel;

public class ControlButtonActionListener implements ActionListener{
	
	private BounceBallController bounceBallController;
	private BounceBallManager bounceBallManager;
	
	public ControlButtonActionListener(BounceBallController bounceBallController,BounceBallManager bounceBallManager) {
		// TODO Auto-generated constructor stub
		this.bounceBallController=bounceBallController;
		this.bounceBallManager=bounceBallManager;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String buttonName = e.getActionCommand();
		if (buttonName.equals(BounceBallControlPanel.BounceBallStartStopButtonName)) bounceBallController.bounceBallStartStop(); 
		if (buttonName.equals(BounceBallControlPanel.BounceBallAddButtonName)) bounceBallManager.createBall();
		if (buttonName.equals(BounceBallControlPanel.BounceBallDeleteButtonName)) bounceBallManager.deleteBall();		
	}
}
