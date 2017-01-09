import static org.junit.Assert.*;
import org.junit.Test;

public class TestCases {

	@Test
	public void Test1() {
		int[] numbers = { 5, -5, 300, 17, 0 };
		int result = Solution.findLargest(numbers);
		
		assertEquals("Simple data sample", 300, result);
	}

	@Test
    public void Test2() {
		int[] numbers = { Integer.MIN_VALUE };
		int result = Solution.findLargest(numbers);
		
		assertEquals("Contains only Integer.MIN_VALUE", Integer.MIN_VALUE, result);
	}

	@Test
	public void Test3() {
		int[] numbers = { 876, 34, 0, 145, 90 };
		int result = Solution.findLargest(numbers);
		
		assertEquals(" Largest number is at position 0", 876, result);
    }

	@Test
	public void Test4() {
		int[] numbers = { 34, 0, 145, 90, 999 };
		int result = Solution.findLargest(numbers);
		
		assertEquals("Largest number is at the last position", 999, result);
    }
}
