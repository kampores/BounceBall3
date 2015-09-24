package bounceBallControl;

import bounceBallModel.BounceBall;
import bounceBallModel.BounceBallBox;
import bounceBallModel.BounceBallManager;
import bounceBallView.BounceBallWindow;


public class BounceBallController {

	private BounceBallManager bounceBallManager;
	private BounceBallBox bounceBallBox;
	private BounceBallWindow bounceBallWindow;

	public BounceBallController() {
		// TODO Auto-generated constructor stub
		bounceBallManager = new BounceBallManager();
		bounceBallWindow = new BounceBallWindow(this,bounceBallManager);
		this.bounceBallBox=bounceBallManager.getBounceBallBox();
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
	
	
	public BounceBallController getBounceBallControl(){
		return this;
	}
	
	public static void main(String[] args) {
		new BounceBallController();
	}
}
