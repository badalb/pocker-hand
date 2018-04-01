package com.test.pocker.hand.evaluator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.type.Category;

public class FullHouseTest {

	private Evaluator fullHouse;

	@Before
	public void setUp() throws Exception {
		fullHouse = new FullHouse();
	}

	@After
	public void tearDown() throws Exception {
		fullHouse = null;
	}

	@Test
	public void testEvaluate() {
		int[] rankMatrix = { 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 0 };
		int[] suitMatrix = { 1, 2, 1, 1 };

		try {
			Category category = fullHouse.evaluate(rankMatrix, suitMatrix);
			System.out.println(category);
			assertTrue(category.equals(Category.FULL_HOUSE));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
