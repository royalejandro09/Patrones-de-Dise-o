package com.company;

public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    public static final String CODIGO_EMPLEADO_CONTRATADO = "EMP-EXT";
    public static final String CODIGO_EMPLEADO_RD = "EMP-INT";

    private EmpleadoFactory() {
    }

    public static EmpleadoFactory getInstance() {

        if(instance == null){
            instance = new EmpleadoFactory();
        }

        return instance;
    }


    public Empleado generarEmpleado(String codigo){
        switch (codigo) {
            case CODIGO_EMPLEADO_RD:
                return new EmpleadoRelacionDependencia(1000.0);
            case CODIGO_EMPLEADO_CONTRATADO:
                return new EmpleadoContratado(7.0,14.0);
            default:
                return null;
        }
    }



}
