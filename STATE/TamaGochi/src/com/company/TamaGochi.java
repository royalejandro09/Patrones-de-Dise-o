package com.company;

public class TamaGochi {

    private State estadoActual;

    public TamaGochi(){
        estadoActual = new Feliz();
    }

    public void darDeComer() {
      estadoActual = estadoActual.comer();
    }

    public void darDeBeber() {
        estadoActual = estadoActual.beber();
    }

    public void darleMimos() {
        estadoActual = estadoActual.mimar();
    }

    public void mostrarEstado(){
        System.out.println(estadoActual);
    }
}
