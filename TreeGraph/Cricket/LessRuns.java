package com.metacube.TreeGraph.Cricket;

import java.util.*;

public class LessRuns {
	/*
	 * Used to get the order of balls bowled by which bowler
	 * 
	 * @param numberOfBalls
	 *            total number of balls left in match
	 * @param numberOfBowlers
	 *            total number of bowlers left
	 * @param ballsForEachBowler
	 *            balls per each bowler
	 * @return array of order of bowlers should be bowled
	 */
	public static int[] findOrderOfBowlers(int numberOfBalls,
			int numberOfBowlers, int ballsForEachBowler[]) {
		int arrangedOrderOfBowlers[] = new int[numberOfBalls];

		if (numberOfBowlers != ballsForEachBowler.length) {
			throw new AssertionError("bowls allocation per bowler is incorrect");
		}

		int sum = 0;
		for (int ball : ballsForEachBowler) {
			sum += ball;
		}

		if (sum != numberOfBalls) {
			throw new AssertionError("Number of balls and its sum is not equal");
		}

		Map<Integer, Integer> ballsPerBowler = new HashMap<Integer, Integer>();
		int key = 0;
		for (int i = 0; i < numberOfBowlers; i++) {
			ballsPerBowler.put(++key, ballsForEachBowler[i]);
		}

		int i = 0;

		while (numberOfBalls != 0) {

			int maxBalls = Collections.max(ballsPerBowler.values());
			for (Map.Entry<Integer, Integer> entry : ballsPerBowler.entrySet()) {

				if (entry.getValue() == maxBalls) {
					int bowlerIndex = entry.getKey();

					arrangedOrderOfBowlers[i++] = bowlerIndex;

					ballsPerBowler.put(bowlerIndex, --maxBalls);
					numberOfBalls--;
					break;
				}
			}
		}
		return arrangedOrderOfBowlers;
	}
}
