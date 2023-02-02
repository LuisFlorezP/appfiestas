package org.example;

public class Empleado {

    String nombre;

    public Empleado(){
    }

    public String saludo(String saludito) {
        String saludo = "Hola " + saludito + ", es un placer saludarte.";
        return  saludo;
    }

    public int suma(int n1, int n2) {
        return n1 + n2;
    }
}
