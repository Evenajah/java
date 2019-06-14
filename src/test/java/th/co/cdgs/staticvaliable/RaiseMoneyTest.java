package th.co.cdgs.staticvaliable;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaiseMoneyTest {
	
	@Test
	public void case1Deposit() {
		RaiseMoney a = new RaiseMoney();
		a.deposit(100);
		assertEquals(100, a.getBalance());
	}
	
	@Test
	public void case2Deposit() {
		RaiseMoney a = new RaiseMoney();
		a.deposit(100);
		assertEquals(200, a.getBalance());
	}
	
	
	@Test
	public void case3Withdraw() {
		RaiseMoney a = new RaiseMoney();
		a.withdraw(10);
		assertEquals(190, a.getBalance());
	}

	@Test
	public void case4Withdraw() {
		RaiseMoney a = new RaiseMoney();
		a.withdraw(10);
		assertEquals(180, a.getBalance());
	}
	
}