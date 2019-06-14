package th.co.cdgs;

public class ReverseString {

	public String reverse(String hello) {

		String newHello = "";
		for (int i = hello.length(); i != 0; i--) {
			System.out.println(hello.charAt(i - 1));
			newHello += hello.charAt(i - 1);
		}
		System.out.println(newHello);
		return newHello;
	}

}
