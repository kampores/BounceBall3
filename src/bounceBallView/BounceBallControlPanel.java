package bounceBallView;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class BounceBallControlPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3891165419324205102L;
	private JComboBox<String> bounceBallColorComboBox	= null;
	private JComboBox<String> bounceBallAmountComboBox	= null;
	private JButton bounceBallStartStopButton	= null;
	private JButton bounceBallAddButton			= null;
	private JButton bounceBallDeleteButton		= null;
	public final String BounceBallStartStopButtonName = "Start/Stop";
	public final String BounceBallAddButtonName = "Add Ball";
	public final String BounceBallDeleteButtonName = "Delete Ball";
	public final String[] BounceBallColorComboBoxString = {"Red","Green","Blue"};
	public final String[] BounceBallAmountComboBoxString = {"1","2","3"};

	
	public BounceBallControlPanel() {
		// TODO Auto-generated constructor stub
		bounceBallStartStopButton = new JButton(BounceBallStartStopButtonName);
		bounceBallColorComboBox = new JComboBox<String>(BounceBallColorComboBoxString);
		bounceBallAmountComboBox = new JComboBox<String>(BounceBallAmountComboBoxString);
		bounceBallAddButton = new JButton(BounceBallAddButtonName);
		bounceBallDeleteButton = new JButton(BounceBallDeleteButtonName);
		add(bounceBallStartStopButton);
		add(bounceBallColorComboBox);
		add(bounceBallAmountComboBox);
		add(bounceBallAddButton);
		add(bounceBallDeleteButton);
	}

	public void addActionListener(ActionListener bounceBallButtonActionListener) {
		bounceBallStartStopButton.addActionListener(bounceBallButtonActionListener);
		bounceBallAddButton.addActionListener(bounceBallButtonActionListener);
		bounceBallDeleteButton.addActionListener(bounceBallButtonActionListener);
	}

	public String getBounceBallColorComboBoxSelectedItem() {
		return bounceBallColorComboBox.getSelectedItem().toString();
	}

	public String getBounceBallAmountComboBoxSelectedItem() {
		return bounceBallAmountComboBox.getSelectedItem().toString();
	}
}
