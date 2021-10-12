package advent;

import java.io.IOException;

import solutions.Solution;

public class AdventRunner {
	
	public static void main(String[] args) throws IOException {
		if(args.length == 2) {
			try {
				new AdventRunner().run(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			} catch (NumberFormatException ex) {
				new AdventRunner().run(null, null);
			}
		} else {
			new AdventRunner().run(null, null);
		}
	}

	private void run(Integer year, Integer challenge) throws IOException {
		Solution solution;
		if(year == null) {
			year = 2015;
		}
		if(challenge == null) {
			solution = Solution.getLastSolution();
		} else {
			solution = Solution.getSolution(year, challenge);
		}
		long start = System.currentTimeMillis();
		Object out1 = solution.part1();
		System.out.println("Part 1 took " + (System.currentTimeMillis() - start) + "ms");
		System.out.println(out1);
		start = System.currentTimeMillis();
		Object out2 = solution.part2();
		System.out.println("Part 2 took " + (System.currentTimeMillis() - start) + "ms");
		System.out.println(out2);
		solution.get1Visual().ifPresent(v -> v.show());
		solution.get2Visual().ifPresent(v -> v.show());
	}
}