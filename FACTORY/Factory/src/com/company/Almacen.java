package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(String producto){
        productos.add(ProductoFactory.generarProducto(producto));
    }

    public Double calcularEspacioNecesario(){
        double espacioNecesario=0.0;
        for (Producto producto : productos) {
            espacioNecesario+=producto.calcularEspacio();
        }
        return espacioNecesario;
    }
}
