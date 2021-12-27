package com.codedifferently.labs.lab03a.examples.example02_card;

public class Card {
    private String suit;
    private String name;
    private int points;

    public Card() {
    }

    public Card(String suit, String name, int points) {
        this.suit = suit;
        this.name = name;
        this.points = points;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }


}
