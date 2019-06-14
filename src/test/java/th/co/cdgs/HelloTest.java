package th.co.cdgs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	@Test
	public void getHelloShouldBeHello() {
		Hello hello = new Hello();
		assertEquals("Hello",hello.getHello());
	}

}
