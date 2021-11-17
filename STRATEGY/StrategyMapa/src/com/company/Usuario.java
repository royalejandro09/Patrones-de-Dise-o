package com.company;

public class Usuario {

    private PuntoMapa ubicacionActual;

    public Usuario(PuntoMapa ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }


    public Double cuantoTardo(PuntoMapa ubicacionFinal, TransporteStrategy transporteStrategy){
        return transporteStrategy.calcularTiempo(ubicacionActual.calcularDistancia(ubicacionFinal));
    }
}
