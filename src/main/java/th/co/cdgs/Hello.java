package th.co.cdgs;

public class Hello {

	public String getHello() {
		return "Hello";
	}

	public static void plusNumeric(){
		double sum = 0;
		for(double i = 0.1;i<1;i+=0.1) {
			System.out.println(sum += i);
		}
		
	}

}
