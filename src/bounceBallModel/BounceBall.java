package bounceBallModel;

public class BounceBall {
	
	private int positionX;
	private int positionY;
	private int directionX;
	private int directionY;
	private int radius;
	
	public BounceBall(int positionX,int positionY,int radius) {
		// TODO Auto-generated constructor stub
		this.positionX=positionX;
		this.positionY=positionY;
		this.radius=radius;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getDirectionX() {
		return directionX;
	}

	public void setDirectionX(int directionX) {
		this.directionX = directionX;
	}

	public int getDirectionY() {
		return directionY;
	}

	public void setDirectionY(int directionY) {
		this.directionY = directionY;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
