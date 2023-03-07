package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test1() {
		int i=9/0;
		System.out.println(i);
		
	}

}
