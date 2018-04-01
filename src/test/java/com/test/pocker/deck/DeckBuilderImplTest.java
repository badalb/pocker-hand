package com.test.pocker.deck;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.card.Card;

public class DeckBuilderImplTest {

	private DeckBuilder deckBuilder;

	@Before
	public void setUp() throws Exception {
		deckBuilder = new DeckBuilderImpl();
	}

	@After
	public void tearDown() throws Exception {
		deckBuilder = null;
	}

	@Test
	public void testBuild() {
		List<Card> cards = deckBuilder.build();
		assertTrue(cards.size() == 52);
	}

}
