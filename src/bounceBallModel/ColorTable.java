package bounceBallModel;

public class ColorTable {

	public static String RED = "#FF0000";
	public static String GREEN = "#00FF00";
	public static String BLUE = "#0000FF";
	public static String WHITE = "#FFFFFF";	

	public ColorTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String ColorNameToCode(String colorName) {
		// TODO Auto-generated method stub
		String colorCode = null;
		if (colorName.equals("Red")) colorCode = ColorTable.RED;
		if (colorName.equals("Green")) colorCode = ColorTable.GREEN;
		if (colorName.equals("Blue")) colorCode = ColorTable.BLUE;
		if (colorName.equals("White")) colorCode = ColorTable.WHITE;		
		if (colorCode == null) {
			System.out.println("Cannot detect color.");
			System.exit(1);
		}
		return colorCode;
	}
}
