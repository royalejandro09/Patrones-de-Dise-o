package com.company;

public class Sediento implements State {

    @Override
    public State comer() {
        return new Triste();
    }

    @Override
    public State beber() {
        return new Feliz();
    }

    @Override
    public State mimar() {
        return this;
    }
}
