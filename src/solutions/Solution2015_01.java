package solutions;

import java.util.List;

public class Solution2015_01 extends Solution {

	@Override
	protected int getChallengeNumber() {
		return 1;
	}

	@Override
	protected int getChallengeYear() {
		return 2015;
	}

	@Override
	protected Object part1(List<String> input) {
		int floor = 0;
		for(char c : input.get(0).toCharArray()) {
			if(c == '(') {
				floor++;
			} else {
				floor--;
			}
		}
		return floor;
	}

	@Override
	protected Object part2(List<String> input) {
		int floor = 0;
		int steps = 0;
		for(char c : input.get(0).toCharArray()) {
			steps++;
			if(c == '(') {
				floor++;
			} else {
				floor--;
			}
			if(floor < 0) {
				return steps;
			}
		}
		return null;
	}
}
