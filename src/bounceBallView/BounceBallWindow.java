package bounceBallView;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import bounceBallModel.BounceBallManager;

public class BounceBallWindow {
	
	private BounceBallControlPanel bounceBallControlPanel	= null;
	private BounceBallDrawComponent bounceBallDrawComponent	= null;
	private JFrame bounceBallFrame	= null;
	
	public BounceBallWindow() {
		// TODO Auto-generated constructor stub
		this.bounceBallControlPanel = new BounceBallControlPanel();
		this.bounceBallFrame = new JFrame("Bounce Ball");
		bounceBallFrame.setSize(500, 500);
		bounceBallFrame.setLocation(400, 400);
		bounceBallFrame.add(bounceBallControlPanel.getBounceBallPanel(), BorderLayout.NORTH);
	}
	
	public void redrawBounceBallComponent(){
		bounceBallDrawComponent.repaint();
	}
	
	public void cannotDeleteBounceBallPopupMessage(){
		JOptionPane.showMessageDialog(bounceBallFrame, "더 지울 공이 없습니다.");
	}

	public void deleteBounceBallNoticePopupMessage(int removedBalls, int deleteBallNumber) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(bounceBallFrame, "공 "+removedBalls+" 개 삭제성공 "+deleteBallNumber+ "개 삭제실패.");
	}

	public BounceBallControlPanel getBounceBallControlPanel() {
		return bounceBallControlPanel;
	}

	public void setBounceBallButtonActionListener(ActionListener bounceBallButtonActionListener) {
		// TODO Auto-generated method stub
		bounceBallControlPanel.addActionListener(bounceBallButtonActionListener);		
	}

	public void createBounceBallDrawComponent(BounceBallManager bounceBallManager) {
		this.bounceBallDrawComponent = new BounceBallDrawComponent(bounceBallManager);
		bounceBallFrame.add(bounceBallDrawComponent.getBounceBallDrawComponent(),BorderLayout.CENTER);
	}

	public void setVisible() {
		bounceBallFrame.setVisible(true);		
	}
}
