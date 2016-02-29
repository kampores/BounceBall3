package bounceBallView;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class BounceBallControlPanel {

	private JPanel bounceBallPanel	= null;
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
		bounceBallPanel = new JPanel();
		bounceBallStartStopButton = new JButton(BounceBallStartStopButtonName);
		bounceBallColorComboBox = new JComboBox<String>(BounceBallColorComboBoxString);
		bounceBallAmountComboBox = new JComboBox<String>(BounceBallAmountComboBoxString);
		bounceBallAddButton = new JButton(BounceBallAddButtonName);
		bounceBallDeleteButton = new JButton(BounceBallDeleteButtonName);
		bounceBallPanel.add(bounceBallStartStopButton);
		bounceBallPanel.add(bounceBallColorComboBox);
		bounceBallPanel.add(bounceBallAmountComboBox);
		bounceBallPanel.add(bounceBallAddButton);
		bounceBallPanel.add(bounceBallDeleteButton);
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

	public JPanel getBounceBallPanel() {
		return bounceBallPanel;
	}
}
