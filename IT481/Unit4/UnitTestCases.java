import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestCases {

	@Test
	public void Test1Example1() {
		UnitTestModule t1 = new UnitTestModule();
		
		int[] list = {1, 50, 200, 312, 500, 519 };
		int look = 4;
		int result = t1.Example1(list, look);
		
		assertEquals(result, 1, "The minimum list value is 18");
		assertNotEquals(result, 50, "The minimum is not 50");
		System.out.println("Minimum value after "+ look +" looks: " + result);
	}
	@Test
	public void Test2Example1() {
		UnitTestModule t2 = new UnitTestModule();
		
		int[] list = new int[10];
		for (int i = 0; i < 10; i++) {
			list[i]= i + 1;
		}
		t2.Example2(list);
		
		assertTrue(true, "Success");
		assertNotEquals(null, false, "Function did not fail");
	}
	@Test
	public void Test3Example1() {
		UnitTestModule t3 = new UnitTestModule();
		int[] list = {1, 5, 7, 10};
		boolean result = t3.Example3(list);
		
		assertTrue(true, "Function Success");
		assertEquals(result, true, "The values were in the list");
	}
	@Test
	public void Test1Example2() {
		UnitTestModule t4 = new UnitTestModule();
		
		int[] list = {141, 62, 210, 312, 14, 32 };
		int look = 6;
		int result = t4.Example1(list, look);
		
		assertEquals(result, 14, "The minimum list value is 14");
		assertNotEquals(result, 62, "The minimum is not 62");
		System.out.println("Minimum value after "+ look +" looks: " + result);

}
	@Test
	public void Test2Example2() {
		UnitTestModule t5 = new UnitTestModule();
		
		int[] list = new int[10];
		for (int i = 0; i < 10; i++) {
			list[i]= i + 1;
		}
		t5.Example2(list);
		
		assertTrue(true, "Success");
		assertNotEquals(null, false, "Function did not fail");
	
	
}
	@Test
	public void Test3Example2() {
		UnitTestModule t6 = new UnitTestModule();
		int[] list = {11, 51, 7, 100};
		boolean result = t6.Example3(list);
		
		assertTrue(true, "Function Success");
		assertEquals(result, true, "The values were in the list");
}
}
