package bounceBallModel;

import java.util.ArrayList;
import java.util.Random;

import bounceBallView.BounceBallWindow;

public class BounceBallManager {
	private ArrayList<BounceBall> bounceBallList = new ArrayList<BounceBall>();
	private BounceBallBox bounceBallBox;
	private Random random;
	private int bounceBallIndex;
	private boolean bounceBallMove;
	private BounceBallWindow bounceBallWindow;
	
	public BounceBallManager() {
		// TODO Auto-generated constructor stub
		this.bounceBallBox=new BounceBallBox(100, 100, 300, 200);
		this.bounceBallIndex=0;
		this.bounceBallMove=true;
		this.random=new Random();

	}
	
	public void createBall(){
		BounceBall bounceBall=new BounceBall(bounceBallBox.getPositionX()+random.nextInt(bounceBallBox.getWidth()),
											bounceBallBox.getPositionY()+random.nextInt(bounceBallBox.getHeight()),
											10);
		bounceBall.setDirectionX(random.nextInt(1)*2-1);
		bounceBall.setDirectionY(random.nextInt(1)*2-1);
		bounceBallList.add(bounceBall);
		bounceBallIndex++;
	}
	
	public void deleteBall(){
		if(bounceBallList.isEmpty()){
			bounceBallWindow.cannotDeleteBounceBallPopupMessage();
		}
		else{
			bounceBallList.remove(bounceBallIndex---1);
		}
	}
	
	public boolean isBounceBallMove() {
		return bounceBallMove;
	}

	public void setBounceBallMove(boolean bounceBallMove) {
		this.bounceBallMove = bounceBallMove;
	}

	public BounceBallBox getBounceBallBox() {
		return bounceBallBox;
	}

	public ArrayList<BounceBall> getBounceBallList() {
		return bounceBallList;
	}

	public void setBounceBallWindow(BounceBallWindow bounceBallWindow) {
		this.bounceBallWindow = bounceBallWindow;
	}
	
}
