package th.co.cdgs.shape;

public class Circle implements Shape {
	private int area;

	public Circle(int radius) {
		area = radius;
	}

	public int getArea() {
		return (int) (Math.PI * area * area);
	}
}
