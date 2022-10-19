package com.automovil;

public abstract class Coche {
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    public Coche(){}
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        this.velocidad = velocidad;
    }

    public int sumarVelocidad(int vel) {
        if (vel > 0 && vel <= 250) return this.velocidad += vel;
        else return this.velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }


}
