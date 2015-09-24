package bounceBallView;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import bounceBallControl.BounceBallController;
import bounceBallModel.BounceBallManager;

public class BounceBallWindow {
	
	private BounceBallControlPanel bounceBallControlPanel;
	private BounceBallDrawComponent bounceBallDrawComponent;
	private JFrame bounceBallFrame;
	
	public BounceBallWindow(BounceBallController bounceBallController,BounceBallManager bounceBallManager) {
		// TODO Auto-generated constructor stub
		bounceBallManager.setBounceBallWindow(this);
		bounceBallFrame = new JFrame("Bounce Ball");
		bounceBallDrawComponent = new BounceBallDrawComponent(bounceBallManager);
		bounceBallControlPanel = new BounceBallControlPanel(bounceBallController, bounceBallManager);
		bounceBallFrame.setSize(500, 500);
		bounceBallFrame.setLocation(400, 400);
		bounceBallFrame.add(bounceBallDrawComponent,BorderLayout.CENTER);
		bounceBallFrame.add(bounceBallControlPanel, BorderLayout.NORTH);
		bounceBallFrame.setVisible(true);
	}
	
	public void redrawBounceBallComponent(){
		bounceBallDrawComponent.repaint();
	}
	
	public void cannotDeleteBounceBallPopupMessage(){
		JOptionPane.showMessageDialog(bounceBallFrame, "더 지울 공이 없습니다.");
	}
}
