package bounceBallModel;

public class BounceBallBox {
	private int positionX	= 0;
	private int positionY	= 0;
	private int width		= 0;
	private int height		= 0;
	private String colorCodeRGB	= null;
	
	public BounceBallBox(int positionX, int positionY, int width, int height, String colorCodeRGB) {
		// TODO Auto-generated constructor stub
		this.positionX = positionX;
		this.positionY = positionY;
		this.width = width;
		this.height = height;
		this.colorCodeRGB = colorCodeRGB;
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

	public String getColorCodeRGB() {
		return colorCodeRGB;
	}
	
}
