package com.company;

public class PuntoMapa {

    private Double latitud;
    private Double longitud;

    public PuntoMapa(Double latitud, Double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Double calcularDistancia(PuntoMapa otroPunto){
        return Math.abs(latitud - otroPunto.latitud) + Math.abs(longitud - otroPunto.longitud);
    }

}
