package com.company;

public class Hambriento implements State{

    @Override
    public State comer() {
        return new Feliz();
    }

    @Override
    public State beber() {
        return new Triste();
    }

    @Override
    public State mimar() {
        return this;
    }
}
