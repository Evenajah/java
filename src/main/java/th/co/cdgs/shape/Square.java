package th.co.cdgs.shape;

public class Square implements Shape {
	private int area;

	public Square(int width) {
		area = width;
		
	}
	
	public int getArea() {
		// TODO Auto-generated method stub
		return  area*area;
	}

}
