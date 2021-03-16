package com.metacube.TreeGraph.Cricket;

import static org.junit.Assert.*;

import org.junit.Test;

public class LessRunsTest {
	// finding order of balls to be bowled by baller
	@Test
	public void findOrderOfBowlersTest() throws Exception {
		assertArrayEquals(new int[] { 1, 1, 2, 1, 2 },
				LessRuns.findOrderOfBowlers(5, 2, new int[] { 3, 2 }));
		assertArrayEquals(new int[] { 2, 2, 1, 2, 3 },
				LessRuns.findOrderOfBowlers(5, 3, new int[] { 1, 3, 1 }));
		assertArrayEquals(new int[] { 2, 2, 1, 2, 1, 2, 3 },
				LessRuns.findOrderOfBowlers(7, 3, new int[] { 2, 4, 1 }));
		assertArrayEquals(new int[] { 1, 3, 1, 2, 3, 1, 2, 3, 4 },
				LessRuns.findOrderOfBowlers(9, 4, new int[] { 3, 2, 3, 1 }));
		assertArrayEquals(
				new int[] { 2, 2, 3, 7, 1, 2, 3, 4, 5, 6, 7 },
				LessRuns.findOrderOfBowlers(11, 7, new int[] { 1, 3, 2, 1, 1,
						1, 2 }));
		assertArrayEquals(new int[] { 2, 1, 2, 1, 2 },
				LessRuns.findOrderOfBowlers(5, 2, new int[] { 2, 3 }));
		assertArrayEquals(new int[] { 1, 1, 3, 1, 3, 1, 2, 3 },
				LessRuns.findOrderOfBowlers(8, 3, new int[] { 4, 1, 3 }));
	}
}
