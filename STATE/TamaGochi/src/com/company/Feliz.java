package com.company;

public class Feliz implements State{

    @Override
    public State comer() {
        return new Sediento();
    }

    @Override
    public State beber() {
        return new Hambriento();
    }

    @Override
    public State mimar() {
        return this;
    }
}
