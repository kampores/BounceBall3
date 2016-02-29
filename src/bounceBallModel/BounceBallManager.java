package bounceBallModel;

import java.util.ArrayList;
import java.util.Random;

import bounceBallView.BounceBallWindow;

public class BounceBallManager {
	private ArrayList<BounceBall> bounceBallList = new ArrayList<BounceBall>();
	private BounceBallBox bounceBallBox	= null;
	private Random random	= null;
	private boolean bounceBallMove	= false;
	private BounceBallWindow bounceBallWindow	= null;
	
	public BounceBallManager() {
		// TODO Auto-generated constructor stub
		this.bounceBallMove=true;
		this.random=new Random();
	}

	public BounceBallBox createBounceBallBox(int leftTopPositionX, int leftTopPositionY, int width, int height, String colorCodeRGB) {
		this.bounceBallBox=new BounceBallBox(leftTopPositionX, leftTopPositionY, width, height, colorCodeRGB);
		return bounceBallBox;
	}
	
	public void createBall(String bounceBallColorCode){
		BounceBall bounceBall=new BounceBall(bounceBallBox.getPositionX()+random.nextInt(bounceBallBox.getWidth()),
											bounceBallBox.getPositionY()+random.nextInt(bounceBallBox.getHeight()),
											10,
											bounceBallColorCode);
		bounceBall.setDirectionX(random.nextInt(1)*2-1);
		bounceBall.setDirectionY(random.nextInt(1)*2-1);
		bounceBallList.add(bounceBall);
	}
	
	public void deleteBall(String bounceBallColorCode,int deleteBallNumber){
		int removedBalls = 0;
		int bounceBallListSize = bounceBallList.size();
		if(bounceBallList.isEmpty()){
			bounceBallWindow.cannotDeleteBounceBallPopupMessage();
			return;
		}
		for(int i=bounceBallListSize-1;0<=i;i--){
			if (bounceBallColorCode.equals(bounceBallList.get(i).getColorCodeRGB())) {
				if (0<deleteBallNumber) {
					bounceBallList.remove(i);
					deleteBallNumber--;					
					removedBalls++;
				}
				else {
					break;
				}
			}
		}
		if (0<deleteBallNumber) {
			bounceBallWindow.deleteBounceBallNoticePopupMessage(removedBalls,deleteBallNumber);
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
