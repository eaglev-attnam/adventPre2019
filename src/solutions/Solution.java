package solutions;

import visuals.Visual;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Solution {

	private static final int START_YEAR = 2014;

	public static final Solution[][] SOLUTIONS = new Solution[][] {
			{
				new Solution0()
			},
			{
				new Solution2015_01()
			}
		};

	protected abstract int getChallengeNumber();
	protected abstract int getChallengeYear();
	protected abstract Object part1(List<String> input);
	protected abstract Object part2(List<String> input);

	public Object part1() throws IOException {
		return part1(getInputFile(1));
	}
	public Object part2() throws IOException {
		return part2(getInputFile(sameInputFile() ? 1 : 2));
	}
	
	protected boolean sameInputFile() {
		return true;
	}
	
	protected List<String> getInputFile(int part) throws IOException {
		try (Stream<String> stream = Files.lines(Paths.get(String.format("resources/input.%d.%d.%d", getChallengeYear(), getChallengeNumber(), part)))) {
			return stream.collect(Collectors.toList());
		}
	}
	
	public static Solution getSolution(int year, int challenge) {
		return SOLUTIONS[year - START_YEAR][challenge];
	}
	
	public static Solution getLastSolution() {
		Solution[] lastYear = SOLUTIONS[SOLUTIONS.length - 1];
		return lastYear[lastYear.length - 1];
	}
	
	public Optional<Visual> get1Visual() {
		return Optional.empty();
	}
	
	public Optional<Visual> get2Visual() {
		return Optional.empty();
	}
}
