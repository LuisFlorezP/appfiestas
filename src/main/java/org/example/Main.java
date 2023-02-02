package org.example;

public class Main {
    public static void main(String[] args) {
        Empleado objetoEmpleado = new Empleado();
        String valor = objetoEmpleado.saludo("Luchito");
        int resultado = objetoEmpleado.suma(2,3);

        System.out.println(valor);
        System.out.println(objetoEmpleado.saludo("Luchito"));

        System.out.println(resultado);
        System.out.println(objetoEmpleado.suma(2,7));
    }
}