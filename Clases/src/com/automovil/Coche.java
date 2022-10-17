package com.automovil;

public class Coche {
    // Atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // Constructores
    public Coche(){}
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad) {

        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        this.velocidad = velocidad;
    }

    // Metodoo
    public Integer sumarVelocidad(Integer vel) {
        if (vel > 0 && vel <= 200) return this.velocidad += vel;
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

    public void main(String[] args) {
    }
}
