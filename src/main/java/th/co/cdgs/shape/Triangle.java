package th.co.cdgs.shape;

public class Triangle implements Shape {
	private int base;
	private int height2;
	
	public Triangle(int width, int height) {
		base =  width;
		height2 = height;
	}

	public int getArea() {
		
		return  (int) (0.5*base*height2);
	}

}
