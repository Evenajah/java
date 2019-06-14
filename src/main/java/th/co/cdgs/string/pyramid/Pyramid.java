package th.co.cdgs.string.pyramid;

public class Pyramid {

	public String print(int recieveNumber) {

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
		return pyramid;

	}

}
