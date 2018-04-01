package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public class Flush implements Evaluator {

	private Evaluator executor;

	@Override
	public void setNextEvaluator(Evaluator evaluate) {
		executor = evaluate;
	}

	@Override
	public Category evaluate(int[] rankMatrix, int[] suitMatrix) {
		for (int i = 0; i < suitMatrix.length; i++) {
			if (suitMatrix[i] == 5) {
				return Category.FLUSH;
			}
		}
		return executor.evaluate(rankMatrix, suitMatrix);
	}
}
