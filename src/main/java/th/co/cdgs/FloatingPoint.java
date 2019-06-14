package th.co.cdgs;

import java.math.BigDecimal;

public class FloatingPoint {
	
	public BigDecimal plusZeroPointOne() {
		BigDecimal big = BigDecimal.ZERO;
		BigDecimal temp = BigDecimal.valueOf(0.1);
		for (int i = 0; i < 10; i++) {
			big = big.add(temp);
			System.out.println(big);
		} 
		return big;
		
	}


}