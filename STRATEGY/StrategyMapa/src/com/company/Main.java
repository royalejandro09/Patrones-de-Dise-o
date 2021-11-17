package com.company;

import java.time.Period;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PuntoMapa ubicacion1 = new PuntoMapa(20.0,50.0);
        PuntoMapa ubicacion2 = new PuntoMapa(-3.0,60.0);
        PuntoMapa ubicacion3 = new PuntoMapa(-20.0,-20.0);

        Auto auto = new Auto();
        Bicicleta bicicleta = new Bicicleta();

        Usuario usuario = new Usuario(ubicacion1);

        System.out.println(usuario.cuantoTardo(ubicacion2,auto));
        System.out.println(usuario.cuantoTardo(ubicacion2,bicicleta));
        System.out.println(usuario.cuantoTardo(ubicacion2, new TransporteStrategy() {
            @Override
            public Double calcularTiempo(Double distancia) {
                return distancia/10;
            }
        }));
    }
}
