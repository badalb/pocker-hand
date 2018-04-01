package com.test.pocker.hand.evaluator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.type.Category;

public class FourOfaKindTest {

	private Evaluator fourOfaKind;

	@Before
	public void setUp() throws Exception {
		fourOfaKind = new FourOfaKind();
	}

	@After
	public void tearDown() throws Exception {
		fourOfaKind = null;
	}

	@Test
	public void testEvaluate() {
		int[] rankMatrix = { 0, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0 };
		int[] suitMatrix = { 1, 1, 1, 1 };

		try {
			Category category = fourOfaKind.evaluate(rankMatrix, suitMatrix);
			System.out.println(category);
			assertTrue(category.equals(Category.FOUR_OF_A_KIND));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
