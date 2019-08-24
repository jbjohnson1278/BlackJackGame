/*
* Hand.java
* Author: Jamison Johnson
* Submission Date: 12/4/2018
*
* Purpose: This is the hand class. It gives all the hand functions for the game to work
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
/**
 * 
 * @author ghyzel
 *
 */
public class Hand {
	
	/**
	 * The cards in the hand
	 */
	private Card [] cards;
	
	/**
	 * Creates an empty hand
	 */
	public Hand() {
		//Initializing an empty array. 
		//Calling cards.length on this array would return 0
		cards = new Card[0];		
	}

	/**
	 * Adds Card c to the hand
	 * 
	 * @param c card to be added
	 */
	public void addCard(Card c) {
		Card [] deck = new Card[cards.length + 1];
		deck[deck.length-1] = c;
		for (int i = 0; i < deck.length - 1; i++)
		{
			deck[i] = cards[i];
		}
		cards = deck;
	}
	
	/**
	 * @return number of cards in the hand
	 */
	public int size() {
		return cards.length;
	}
	
	/**
	 * Returns an array of all the cards in the hand
	 * 
	 * @return the cards in the hand
	 */
	public Card[] getCards() {
		Card [] currCards = new Card[cards.length];
		for (int i = 0; i < currCards.length; i++)
		{
			currCards[i] = cards[i];
		}
		return currCards;
	}
	
	/**
	 * Empties the hand, and returns an array containing the discarded cards.
	 * 
	 * @return the discarded cards
	 */
	public Card[] emptyHand() {
		Card [] disCards = new Card[cards.length];
		for (int i = 0; i < disCards.length; i++)
			disCards[i] = cards[i];
		cards = new Card[0];
		return disCards;
	}
	
	/**
	 * Returns a String representation of the hand
	 * 
	 * E.g.
	 * 
	 * "Empty Hand"
	 * "1. ACE OF SPADES\n2. QUEEN OF HEARTS"
	 * 
	 * @return a String representing the hand
	 */
	@Override
	public String toString() {
		// HINT: Use the toString() method of the card class
		if (cards.length == 0)
			return "Empty hand";
		int count = 1;
		String cardsDescription = "";
		for (Card card : cards)
		{
			cardsDescription += count + ". " + card.getType().toString() + " OF " + card.getSuit().toString() + "\n";
			count ++;
		}
		return cardsDescription;
	}
}
