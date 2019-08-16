package com.salazar;

public class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public double calcularArea(){
        double area;
        double pi = 3.1416d;
        area = Math.pow(radio, 2) * pi;
        return area;
    }
}
