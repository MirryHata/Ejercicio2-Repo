package com.salazar;

public class Main {

    public static void main(String[] args) {
        Circulo radio1 = new Circulo(10d);
        Circulo radio2 = new Circulo(2d);
        Circulo radio3 = new Circulo(5d);

        System.out.println("El area del primer dato es de: " + radio1.calcularArea());
        System.out.println("El area del segundo dato es de: " + radio2.calcularArea());
        System.out.println("El area del tercer dato es de: " + radio3.calcularArea());
    }
}
