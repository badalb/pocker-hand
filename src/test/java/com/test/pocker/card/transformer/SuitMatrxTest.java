package com.test.pocker.card.transformer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.deck.DeckBuilderImpl;

public class SuitMatrxTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateSuitMatrix() {
		int[] rankMatrix = SuitMatrx.createSuitMatrix(new DeckBuilderImpl().build());
		assertTrue(rankMatrix.length == 4);
		assertTrue(rankMatrix[0] == 13);
	}
}
