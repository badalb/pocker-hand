package com.test.pocker.card.transformer;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.deck.DeckBuilderImpl;

public class RankMatrixTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testcreateRankMatrix() {
		int[] rankMatrix = RankMatrix.createRankMatrix(new DeckBuilderImpl().build());
		assertTrue(rankMatrix.length == 13);
		assertTrue(rankMatrix[0] == 4);
	}

}
