package bounceBallModel;

public class BounceBall {
	
	private int positionX	= 0;
	private int positionY	= 0;
	private int directionX	= 0;
	private int directionY	= 0;
	private int radius		= 0;
	private String colorCodeRGB	= null;
	
	public BounceBall(int positionX,int positionY,int radius,String colorCodeRGB) {
		// TODO Auto-generated constructor stub
		this.positionX=positionX;
		this.positionY=positionY;
		this.radius=radius;
		this.colorCodeRGB=colorCodeRGB;
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

	public String getColorCodeRGB() {
		return colorCodeRGB;
	}

	public void setColorCodeRGB(String colorCodeRGB) {
		this.colorCodeRGB = colorCodeRGB;
	}
}
