package th.co.cdgs.shape;

public class Rectangle implements Shape{
	private int widthArea,heightArea;

	public Rectangle(int width, int height) {
		widthArea = width;
		heightArea = height;
	}

	public int getArea() {
		return widthArea*heightArea;
	}
}
