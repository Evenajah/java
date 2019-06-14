package th.co.cdgs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void reverse() {
		ReverseString reverseString = new ReverseString();
		assertEquals("olleH" , reverseString.reverse("Hello"));
	}

}