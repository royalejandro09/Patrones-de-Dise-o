package com.company;

public class EmpleadoRelacionDependencia extends Empleado {

    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }



    @Override
    public Double calcularSueldo(Integer dias) {
        return null;
    }


    @Override
    public String toString() {
        return "EmpleadoRelacionDependencia{" +
                "sueldoMensual=" + sueldoMensual +
                '}';
    }
}
