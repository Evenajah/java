package th.co.cdgs.animalmove;

import java.util.Scanner;

public class Race {
	
	
	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		Turtle turtle = new Turtle();
		for (int i = 1; i <= 10; i++) {
			rabbit.move(i);
			turtle.move(i);
			System.out.println(rabbit.getClass().getSimpleName() + " distance=" + rabbit.getDistance());
			System.out.println(turtle.getClass().getSimpleName() + " distance=" + turtle.getDistance());
			System.out.println("...");
			new Scanner(System.in).nextLine();
		}

		if (rabbit.getDistance() > turtle.getDistance()) {
			System.out.println(rabbit.getClass().getSimpleName() + " Win!");
		} else if (turtle.getDistance() > rabbit.getDistance()) {
			System.out.println(turtle.getClass().getSimpleName() + " Win!");
		} else {
			System.out.println("Deuc!");
		}

	}

}