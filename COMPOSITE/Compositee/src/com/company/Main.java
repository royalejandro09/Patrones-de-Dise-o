package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Producto hamburgesa = new Producto("bigDH",5.0);
        Producto papaFrita = new Producto("papa frita",2.0);
        Producto gaseosa = new Producto("CocaCola",1.5);
        Producto helado =  new Producto("helado", 1.2);

        Combo combo1 = new Combo(0.1);
        combo1.agregarComprable(hamburgesa);
        combo1.agregarComprable(papaFrita);
        combo1.agregarComprable(gaseosa);

        Combo combo2 = new Combo(0.2);
        combo2.agregarComprable(combo1);
        combo2.agregarComprable(combo1);

        Combo combo3 = new Combo(0.3);
        combo3.agregarComprable(combo1);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(combo2);

        Carrito carrito = new Carrito();

        carrito.agregarComprable(combo1);
        carrito.agregarComprable(combo2);
        carrito.agregarComprable(combo3);

        System.out.println(carrito.calcularPrecioCarrito());

    }
}
