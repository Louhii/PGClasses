
public class UnitTestModule {
// 1
	public int Example1(int[] y, int z) {
		
		int currmin = Integer.MAX_VALUE;
		
		for (int i = 0; i < z; i++) {
			if (y[i] < currmin) {
				currmin = y[i];
				
			}
		}
		return currmin;
		
		
		
	}
	public void Example2(int[] a) {
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
	}
	public boolean Example3(int[] foo) {
		int a = 10;
		int b = 5;
		boolean found = false;
		for (int i = 0; i < foo.length; i++) {
			if (a == foo[i]) {
				System.out.println("Value of a was found");
				found = true;
			}
			else if (b == foo[i]) {
				System.out.println("Value of b was found");
			}
		}
		if (found == false) {
			System.out.println("None found");
		}
		return found;
	}
}
