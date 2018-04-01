package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public class Straight implements Evaluator {

	private Evaluator executor;

	@Override
	public void setNextEvaluator(Evaluator evaluate) {
		executor = evaluate;
	}

	@Override
	public Category evaluate(int[] rankMatrix, int[] suitMatrix) {
		int firstOne = -1;
		int lastOne = -1;
		for (int j = 0; j < rankMatrix.length - 1; j++) {
			if (rankMatrix[j] == 1) {
				if (firstOne == -1) {
					firstOne = j;
				} else {
					lastOne = j;
				}
			}
		}
		if (isConsecutiveOnes(lastOne, firstOne)
				|| aceAndFirstFourOne(lastOne, firstOne, rankMatrix[rankMatrix.length - 1])) {
			return Category.STRAIGHT;
		}
		return executor.evaluate(rankMatrix, suitMatrix);
	}

	// 5 consecutive one
	private boolean isConsecutiveOnes(int lastOne, int firstOne) {
		return lastOne - firstOne == 4 ? true : false;
	}

	// first 4 one and ace
	private boolean aceAndFirstFourOne(int lastOne, int firstOne, int ace) {
		return (lastOne - firstOne == 3) && (firstOne == 0 && lastOne == 3) && ace == 1 ? true : false;
	}
}
