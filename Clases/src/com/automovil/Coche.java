package com.automovil;

public class Coche {
    // Atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // Constructor
    public Coche(String colo, String fabric, String mod, Double pes, Double larg, Integer vel) {
        this.color = colo;
        this.fabricante = fabric;
        this.modelo = mod;
        this.peso = pes;
        this.largo = larg;
        this.velocidad = vel;
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
