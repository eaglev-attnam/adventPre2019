package solutions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;

public class TestSolution0 {
	private Solution0 day0 = new Solution0();
	
	@Test
	public void testPart1() {
		List<String> input = Arrays.asList(
				"");
		assert Objects.equals(day0.part1(input), null);
	}
	
	@Test
	public void testPart2() {
		List<String> input = Arrays.asList(
				"null");
		assert Objects.equals(day0.part2(input), null);
	}
}
