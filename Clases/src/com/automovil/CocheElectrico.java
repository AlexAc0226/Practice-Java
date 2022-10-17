package com.automovil;

public class CocheElectrico  extends Coche {
    String motorElectrico;

    public CocheElectrico() {}
    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    // @Override se utiliza para sobreescribir un metodo de la clase padre, en este caso el metodo toString() de la clase Coche (padre)
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
