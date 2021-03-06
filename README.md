# Simple Pocker Hand Evaluator
This simple codebase demonestrates object design for Pocker Hand evaluation for given five cards.

## Execution
The Application can be executed by executing the MainClass or TestMainClass.
TestMainClass requires us to provide 
input like { "HA", "HK", "H2", "H4", "HT" }/{ "SA", "HA", "C2", "CA", "C5" } of course it could be any :), here S,H,D,C denotes the suit type and 2,3, T,J,Q,K,A denotes rank.

## Key Components
The Application uses Category, Rank and Suit as types.
A Card is a composition of Rank and Suit. Deck uses a Deck Builder to build a Deck of Cards.
Deck Builder uses Card Factory to create a Deck of Cards for all Suits and Ranks (so 52 cards in all). 
Deck has a draw card method which takes no of Cards we want to draw from Deck to form a Hand.

We can form a Hand which has a list of Cards drwaing cards from Deck (Random cards are selected).

Pocker hand type Evaluator has a chain of different type of Hand Evaluator like FLUSH, FOUR of a KIND, PAIR etc.
We can add a new Evalutor implementing Evalutor interface.

public class EvaluatorImpl implements Evaluator {

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

A new Evalutor can be appended/removed to the chain using chain implementations add/remove method.
To add a new Evaluator -

	hand.getEvaluators().add(new Evaluator() {
			
			@Override
			public void setNextEvaluator(Evaluator evaluate) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Category evaluate(int[] rankMatrix, int[] suitMatrix) {
				// TODO Auto-generated method stub
				return null;
			}
		});


# Execution Complexity

Evalutors uses two 1-D array, Suit Matrix and Rank Matrix. 
Suit Matrix holds count of cards in hand for each suit and Rank Matrix count of cards in hand for each rank.
So for  { "HA", "HK", "H2", "H4", "HT" } 
	Suit Matrix is [0,5,0,0] and 
	RankMatrix is [1,0,1,0,0,0,0,0,1,0,0,1,1]
So for every hand Space Complexity is of  O(4 ~ n) and  O(13 ~ n) 
All the algorithms run on Suit or Rank Matrix in single iteration and mostly of O(4/13 ~ n)
