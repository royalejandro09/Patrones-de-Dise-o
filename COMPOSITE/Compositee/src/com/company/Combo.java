package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable {

    private List<Comprable> comprables;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        comprables = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable){
        comprables.add(comprable);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        System.out.println("estoy recorriendo un combo");
        for (Comprable comprable : comprables) {
            precioTotal += comprable.calcularPrecio();
        }
        Double precioFinal = precioTotal - (precioTotal * descuento);
        System.out.println("termine de recorrer el combo el precio final es " + precioFinal);
        return precioFinal;
    }
}
