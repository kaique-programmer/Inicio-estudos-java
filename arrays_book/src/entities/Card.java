package entities;

public class Card {
    private final String face; // card face ("Ace", "Deuce", ...)
    private final String suit; // card nape ("Heart", "Diamonds", ...)

    // constructor two arguments begin face and card nape
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace; // initial card face
        this.suit = cardSuit; // initial card nape
    }

    // return representation String card
    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
