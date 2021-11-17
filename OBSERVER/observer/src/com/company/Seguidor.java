package com.company;

public class Seguidor implements Observador{

    private String nombre;
    private String apellido;
    private Integer cantidadDeNotificaciones;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cantidadDeNotificaciones = 0;
    }

    @Override
    public void actualizar(String nombreSujeto) {
        cantidadDeNotificaciones++;
        System.out.println(nombre + " fue notificado de la foto que subió " + nombreSujeto);
    }
}
