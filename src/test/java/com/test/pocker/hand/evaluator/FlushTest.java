package com.test.pocker.hand.evaluator;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.type.Category;

public class FlushTest {

	private Evaluator flush;

	@Before
	public void setUp() throws Exception {
		flush = new Flush();
	}

	@After
	public void tearDown() throws Exception {
		flush = null;
	}

	@Test
	public void testEvaluate() {
		int[] rankMatrix = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1 };
		int[] suitMatrix = { 5, 0, 0, 0 };

		try {
			Category category = flush.evaluate(rankMatrix, suitMatrix);
			System.out.println(category);
			assertTrue(category.equals(Category.FLUSH));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEvaluate_NoFlush() {
		int[] rankMatrix = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1 };
		int[] suitMatrix = { 4, 1, 0, 0 };

		try {
			Category category = flush.evaluate(rankMatrix, suitMatrix);
			System.out.println(category);
			assertTrue(category.equals(Category.FLUSH));
		} catch (Exception e) {
			assertTrue(e != null);
		}
	}
}
