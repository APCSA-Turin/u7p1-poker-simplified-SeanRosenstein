package com.example.project;

public class Runner {
    public static void main(String[] args) {
        Deck d1 = new Deck();
        d1.initializeDeck();
        System.out.println(d1.getCards());
    }
}
