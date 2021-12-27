package com.codedifferently.labs.lab03a.examples.example02_card;

public class CardTester {
    public static void main(String[] args) {
        Card card01 = new Card("Diamonds", "Four", 4);
        System.out.println(card01);
        Card card02 = new Card("Spades", "Ace", 1);
        System.out.println(card02);
        card02 = card01;
        System.out.println(card02);
    }
}
