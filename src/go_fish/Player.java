/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package go_fish;

/**
 *
 * @author aaryansharma
 */
import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card removeCard(String rank) {
        for (Card card : hand) {
            if (card.getRank().equals(rank)) {
                hand.remove(card);
                return card;
            }
        }
        return null;
    }

    public boolean hasCard(String rank) {
        for (Card card : hand) {
            if (card.getRank().equals(rank)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public boolean hasEmptyHand() {
        return hand.isEmpty();
    }
}