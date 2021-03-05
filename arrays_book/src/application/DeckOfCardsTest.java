package application;

import entities.DeckOfCards;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // put cards in order random

        // prints all 52 cards in the order in which they are distributed
        for (int i=0; i <= 52; i++){
            // distributes and display a card
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if(i % 4 == 0) // generates a new line after every fourth card
                System.out.println();
        }
    }
}
