package com.test.pocker.hand.evaluator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.type.Category;

public class StraightTest {

	private Evaluator straight;

	@Before
	public void setUp() throws Exception {
		straight = new Straight();
	}

	@After
	public void tearDown() throws Exception {
		straight = null;
	}

	@Test
	public void testEvaluate_Fail() {
		int[] rankMatrix = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1 };
		int[] suitMatrix = { 0, 0, 0, 0 };

		try {
			Category category = straight.evaluate(rankMatrix, suitMatrix);
			System.out.println(category);
		} catch (Exception e) {
			assertTrue(e != null);
		}
	}

	@Test
	public void testEvaluate_Success() {
		int[] rankMatrix = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0 };
		int[] suitMatrix = { 0, 0, 0, 0 };

		try {
			Category category = straight.evaluate(rankMatrix, suitMatrix);
			System.out.println(category);
			assertTrue(category.equals(Category.STRAIGHT));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEvaluate_Success_withAce() {
		int[] rankMatrix = { 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1 };
		int[] suitMatrix = { 0, 0, 0, 0 };

		try {
			Category category = straight.evaluate(rankMatrix, suitMatrix);
			System.out.println(category);
			assertTrue(category.equals(Category.STRAIGHT));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
