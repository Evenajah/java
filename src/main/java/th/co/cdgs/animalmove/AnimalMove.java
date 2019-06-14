package th.co.cdgs.animalmove;

public abstract class AnimalMove {
	private int distance;

	
	public abstract int step();

	public abstract int sleep();
	
	public int move(int turn) {
		
		int move = (int) (Math.random()*10);
		
		distance = move;
		return move;
		
	}
	
	protected int getDistance(){
		return distance;
	}
}
