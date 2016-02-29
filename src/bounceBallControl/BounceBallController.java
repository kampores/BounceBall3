package bounceBallControl;

import java.awt.event.ActionListener;

import bounceBallModel.BounceBall;
import bounceBallModel.BounceBallBox;
import bounceBallModel.BounceBallManager;
import bounceBallModel.ColorTable;
import bounceBallView.BounceBallControlPanel;
import bounceBallView.BounceBallWindow;


public class BounceBallController {

	private BounceBallManager 	bounceBallManager 	= null;
	private BounceBallBox 		bounceBallBox 		= null;
	private BounceBallWindow 	bounceBallWindow 	= null;
	private ActionListener 		bounceBallButtonActionListener = null;
	private ColorTable 			colorTable	= null;

	public BounceBallController() {
		// TODO Auto-generated constructor stub
		this.colorTable = new ColorTable();
		this.bounceBallManager = new BounceBallManager();
		this.bounceBallBox=bounceBallManager.createBounceBallBox(100, 100, 300, 200, colorTable.ColorNameToCode("White"));
		this.bounceBallWindow = new BounceBallWindow();
		bounceBallWindow.createBounceBallDrawComponent(bounceBallManager);
		bounceBallWindow.setVisible();
		bounceBallManager.setBounceBallWindow(bounceBallWindow);
		bounceBallButtonActionListener = new ControlButtonActionListener(this);
		bounceBallWindow.setBounceBallButtonActionListener(bounceBallButtonActionListener);
		bounceBallControl();
	}

	private void bounceBallControl(){
		while(true){
			if (bounceBallManager.isBounceBallMove()){
				for (BounceBall bounceBall:bounceBallManager.getBounceBallList()){
					ballDirectionControl(bounceBall);
					ballMove(bounceBall);
				}
			}
			bounceBallWindow.redrawBounceBallComponent();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	private void ballDirectionControl(BounceBall bounceBall){
		if (bounceBall.getPositionX()<bounceBallBox.getPositionX()) bounceBall.setDirectionX(1);
		if (bounceBall.getPositionX()>bounceBallBox.getPositionX()+bounceBallBox.getWidth()-bounceBall.getRadius()*2) 
			bounceBall.setDirectionX(-1);
		if (bounceBall.getPositionY()<bounceBallBox.getPositionY()) bounceBall.setDirectionY(1);
		if (bounceBall.getPositionY()>bounceBallBox.getPositionY()+bounceBallBox.getHeight()-bounceBall.getRadius()*2) 
			bounceBall.setDirectionY(-1);		
	}
	
	private void ballMove(BounceBall bounceBall){
		bounceBall.setPositionX(bounceBall.getPositionX()+bounceBall.getDirectionX());
		bounceBall.setPositionY(bounceBall.getPositionY()+bounceBall.getDirectionY());		
	}
	
	public void bounceBallStartStop(){
		if (bounceBallManager.isBounceBallMove()){
			bounceBallManager.setBounceBallMove(false);			
		}
		else{
			bounceBallManager.setBounceBallMove(true);			
		}
	}

	public void buttonActionPerformed(String buttonName) {
		// TODO Auto-generated method stub
		BounceBallControlPanel bounceBallControlPanel;
		bounceBallControlPanel = bounceBallWindow.getBounceBallControlPanel();
		if (buttonName.equals(bounceBallControlPanel.BounceBallStartStopButtonName)) bounceBallStartStop(); 
		if (buttonName.equals(bounceBallControlPanel.BounceBallAddButtonName)) {
			for(int i = 0;i<Integer.parseInt(bounceBallControlPanel.getBounceBallAmountComboBoxSelectedItem());i++){
				bounceBallManager.createBall(colorTable.ColorNameToCode(bounceBallControlPanel.getBounceBallColorComboBoxSelectedItem()));	
			}
		}
		if (buttonName.equals(bounceBallControlPanel.BounceBallDeleteButtonName)) {
			bounceBallManager.deleteBall(colorTable.ColorNameToCode(bounceBallControlPanel.getBounceBallColorComboBoxSelectedItem()),
						Integer.parseInt(bounceBallControlPanel.getBounceBallAmountComboBoxSelectedItem()));
		}
	}
	
	public static void main(String[] args) {
		new BounceBallController();
	}


}
