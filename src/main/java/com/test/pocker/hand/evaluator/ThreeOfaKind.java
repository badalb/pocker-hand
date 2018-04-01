package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public class ThreeOfaKind implements Evaluator {

	private Evaluator executor;

	@Override
	public void setNextEvaluator(Evaluator evaluate) {
		executor = evaluate;
	}

	@Override
	public Category evaluate(int[] rankMatrix, int[] suitMatrix) {
		for (int j = 0; j < rankMatrix.length; j++) {
			if (rankMatrix[j] == 3) {
				return Category.THREE_OF_A_KIND;
			}
		}
		return executor.evaluate(rankMatrix, suitMatrix);
	}
}
