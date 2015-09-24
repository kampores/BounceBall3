package bounceBallModel;

public class BounceBallBox {
	private int positionX;
	private int positionY;
	private int width;
	private int height;
	
	public BounceBallBox(int positionX,int positionY,int width,int height) {
		// TODO Auto-generated constructor stub
		this.positionX=positionX;
		this.positionY=positionY;
		this.width=width;
		this.height=height;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
}
