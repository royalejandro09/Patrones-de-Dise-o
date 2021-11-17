package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Usuario usuario = new Usuario("Timothee", "Chalamet");

    Seguidor seguidor = new Seguidor("Georgina", "Mondino");
    Seguidor seguidor1 = new Seguidor("Paula", "Alonso");
    Seguidor seguidor2 = new Seguidor("Ceci", "Roquez");


    usuario.agregarSeguidor(seguidor);
    usuario.agregarSeguidor(seguidor1);
    usuario.agregarSeguidor(seguidor2);


    usuario.agregarSeguidor(new Observador() {
        @Override
        public void actualizar(String nombreSujeto) {
            System.out.println("Algo");
        }
    });




    }
}
