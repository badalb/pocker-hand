package com.test.pocker.card;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.type.Rank;
import com.test.pocker.type.Suit;

public class CardTest {

	private Card card;

	@Before
	public void setUp() throws Exception {
		card = new Card(Rank.ACE, Suit.SPADES);
	}

	@After
	public void tearDown() throws Exception {
		card = null;
	}

	@Test
	public void testGetRank() {
		Rank rank = card.getRank();
		assertNotNull(rank);
		assertTrue(rank.equals(Rank.ACE));
	}

	@Test
	public void testGetSuit() {
		Suit suit = card.getSuit();
		assertNotNull(suit);
		assertTrue(suit.equals(Suit.SPADES));
	}

}
