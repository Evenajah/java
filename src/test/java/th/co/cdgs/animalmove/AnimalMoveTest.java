package th.co.cdgs.animalmove;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnimalMoveTest {
	
	@Test
	public void rabbitMove1Get1To5() {
		AnimalMove rabbit = new Rabbit();
		assertTrue(rabbit.move(1) >= 1 && rabbit.move(1) <= 5);
	}
	
	@Test
	public void rabbitStepGet5() {
		AnimalMove rabbit = new Rabbit();
		assertEquals(5 , rabbit.step());
	}
	
	@Test
	public void rabbitSleepGet0() {
		AnimalMove rabbit = new Rabbit();
		assertEquals(0 , rabbit.move(5));
	}
	
	@Test
	public void turtleStepGet4() {
		AnimalMove turtle = new Turtle();
		assertEquals(4 , turtle.step());
	}
	
	@Test
	public void turtleMoveGet1To4() {
		AnimalMove turtle = new Turtle();
		assertTrue(turtle.move(1) >= 1 && turtle.move(1) <= 4);
	}
	
	@Test
	public void turtleSleepGet1To4() {
		AnimalMove turtle = new Turtle();
		assertTrue(turtle.move(5) >= 1 && turtle.move(5) <= 4);
	}
	
}