package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();
    EmpleadoFactory otraEmpleadoFactory = EmpleadoFactory.getInstance();



    Empleado empleado = empleadoFactory.generarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_CONTRATADO);

        System.out.println(empleado);

        

    }
}
