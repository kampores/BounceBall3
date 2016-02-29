package bounceBallView;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

import bounceBallModel.BounceBall;
import bounceBallModel.BounceBallBox;
import bounceBallModel.BounceBallManager;

public class BounceBallDrawComponent {
	
	private JComponent bounceBallDrawComponent	= null;
	private BounceBallBox bounceBallBox			= null;
	private BounceBallManager bounceBallManager	= null;
	
	public BounceBallDrawComponent(BounceBallManager bounceBallManager) {
		// TODO Auto-generated constructor stub
		this.bounceBallBox = bounceBallManager.getBounceBallBox();
		this.bounceBallManager = bounceBallManager;
		this.bounceBallDrawComponent = createBounceBallDrawComponent(); 
	}

	private JComponent createBounceBallDrawComponent() {
		// TODO Auto-generated method stub
		JComponent bounceBallDrawComponent;
		bounceBallDrawComponent = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 704075635569963547L;

			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);
				g.setColor(Color.decode(bounceBallBox.getColorCodeRGB()));
				g.fillRect(bounceBallBox.getPositionX(), bounceBallBox.getPositionY(), bounceBallBox.getWidth(), bounceBallBox.getHeight());
				for (BounceBall bounceBall: bounceBallManager.getBounceBallList()){
					g.setColor(Color.decode(bounceBall.getColorCodeRGB()));
					g.fillOval(bounceBall.getPositionX(), bounceBall.getPositionY(), bounceBall.getRadius()*2, bounceBall.getRadius()*2);			
				}
			}
		}; 
 		return bounceBallDrawComponent;
	}

	public JComponent getBounceBallDrawComponent() {
		return bounceBallDrawComponent;
	}

	public void repaint() {
		// TODO Auto-generated method stub
		bounceBallDrawComponent.repaint();
	}
}
