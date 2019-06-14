package th.co.cdgs.staticvaliable;

public class RaiseMoney {
	private static int balance;

	public void deposit(int i) {
		balance += i;
	}

	public int getBalance() {
		return balance;
	}

	public void withdraw(int i) {
		balance -= i;
	}

}
