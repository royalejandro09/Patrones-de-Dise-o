package com.company;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Sujeto {

    private String nombre;
    private String apellido;
    private Boolean subioFoto;
    private List<Observador> seguidores;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        subioFoto = false;
        seguidores = new ArrayList<>();
    }

    public void agregarSeguidor(Observador observador){
        seguidores.add(observador);
    }

    @Override
    public void subirFoto() {
        System.out.println("subi una foto");
        subioFoto = true;
        notificar();
    }

    @Override
    public void eliminarFoto() {
        System.out.println("elimine una foto");
        subioFoto = false;

    }

    @Override
    public void notificar() {
        for (Observador seguidor : seguidores) {
            seguidor.actualizar(this.nombre);
        }
    }

}
