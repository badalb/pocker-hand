package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public interface Evaluator {

	public void setNextEvaluator(Evaluator evaluate);

	public Category evaluate(int[] rankMatrix, int[] suitMatrix);
}
