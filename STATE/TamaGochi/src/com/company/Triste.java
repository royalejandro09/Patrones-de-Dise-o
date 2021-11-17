package com.company;

public class Triste implements State {

    @Override
    public State comer() {
        return this;
    }

    @Override
    public State beber() {
        return this;
    }

    @Override
    public State mimar() {
        return new Feliz();
    }
}
