package th.co.cdgs;

import java.math.BigDecimal;

public class Run {

	public static void main(String[] args) {
		int recieveNumber = 3;
		String pyramid = "";
		for (int i = 0; i < recieveNumber ; i++) {

			for (int j = recieveNumber + 1; j >= 0; j--) {
				for (int k = 1; k <= (2 * i - 1); k++) {
					pyramid += "#";
				}

				pyramid += "*";
			}

			pyramid += "\n";
		}
		System.out.print(pyramid);

	}
	}
		

