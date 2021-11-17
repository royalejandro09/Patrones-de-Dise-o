package com.company;

public class ProductoFactory {
    public static final String CODIGO_CAJA10X10 = "CAJA10X10";
    public static final String CODIGO_PELOTA_FUTBOL = "PELOTAFUTBOL";
    public static final String CODIGO_PELOTA_TENIS = "PELOTA_TENIS";
    private static ProductoFactory instancia;

    private ProductoFactory() {
    }

    public static ProductoFactory getInstancia() {
        if(instancia == null){
            instancia=new ProductoFactory();
        }
        return instancia;
    }

    public static Producto generarProducto(String codigoProducto){
        switch (codigoProducto){
            case CODIGO_CAJA10X10:
                return new Caja(1.0,10.0,10.0,10.0);
            case CODIGO_PELOTA_FUTBOL:
                return new Pelota(1.0,11.0);
            case CODIGO_PELOTA_TENIS:
                return new Pelota(0.5,0.32);
            default:
                return null;
        }
    }
}
