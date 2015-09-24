package bounceBallView;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import bounceBallControl.BounceBallController;
import bounceBallControl.ControlButtonActionListener;
import bounceBallModel.BounceBallManager;

public class BounceBallControlPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3891165419324205102L;
	private JButton bounceBallStartStopButton;
	private JButton bounceBallAddButton;
	private JButton bounceBallDeleteButton;
	private ActionListener bounceBallButtonActionListener;
	public static final String BounceBallStartStopButtonName="Start/Stop";
	public static final String BounceBallAddButtonName="Add Ball";
	public static final String BounceBallDeleteButtonName="Delete Ball";
	
	public BounceBallControlPanel(BounceBallController bounceBallController,BounceBallManager bounceBallManager) {
		// TODO Auto-generated constructor stub
		bounceBallStartStopButton = new JButton(BounceBallStartStopButtonName);
		bounceBallAddButton = new JButton(BounceBallAddButtonName);	
		bounceBallDeleteButton = new JButton(BounceBallDeleteButtonName);
		bounceBallButtonActionListener = new ControlButtonActionListener(bounceBallController,bounceBallManager);
		bounceBallStartStopButton.addActionListener(bounceBallButtonActionListener);
		bounceBallAddButton.addActionListener(bounceBallButtonActionListener);
		bounceBallDeleteButton.addActionListener(bounceBallButtonActionListener);
		add(bounceBallStartStopButton);
		add(bounceBallAddButton);
		add(bounceBallDeleteButton);
	}
}
