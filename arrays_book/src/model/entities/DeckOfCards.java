package model.entities;

import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck; // card objects array
    private int currentCard; // index of the next card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // numbers constant de Cards
    // create random numbers
    private static final SecureRandom randomNumbers = new SecureRandom();

    // constructor fill deck of cards

    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; // create card objects array
        currentCard = 0; // the first card distribute will be the deck[0]

        // fill deck with objects card
        for(int i = 0; i < deck.length; i++)
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
    }

    // shuffle the cards with an algorithm of the a pass
    public void shuffle() {
        // the next call for method dealCard may begin in deck[0] again
        currentCard = 0;

        // for each card, select other card random (0-51) and compare
        for(int first =0; first < deck.length; first++){
            // select a number random between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // compare card current with card random selected
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // distribute a card
    public Card dealCard() {
        // determines if there are still Cards to be dealt
        if(currentCard < deck.length)
            return deck[currentCard++]; // return card current in array
        else
            return null; // return null for to indicate all the cards have been dealt
    }

}
