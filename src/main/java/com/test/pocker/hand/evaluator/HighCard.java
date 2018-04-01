package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public class HighCard implements Evaluator {

	// private Evaluate evaluate;

	@Override
	public void setNextEvaluator(Evaluator evaluate) {
		// executor = evaluate;
	}

	@Override
	public Category evaluate(int[] rankMatrix, int[] suitMatrix) {
		return Category.HIGH_CARD;
	}
}
