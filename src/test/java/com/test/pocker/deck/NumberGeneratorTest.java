package com.test.pocker.deck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.util.NumberGenerator;

public class NumberGeneratorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRandInt() {
		int number = NumberGenerator.randInt(0, 10);
		assertTrue(number >= 0 && number <= 10);
	}

}
