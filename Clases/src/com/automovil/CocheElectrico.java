package com.automovil;

public class CocheElectrico  extends Coche {
    String motorElectrico;

    public CocheElectrico() {}
    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }
    public CocheElectrico(String color, String fabricante, String modelo, double peso, double cilindrada, int velocidad, String motorElectrico) {
        super(color, fabricante, modelo, peso, cilindrada, velocidad);
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

   // Sobreescritura de metodo
    @Override
    public int sumarVelocidad(int vel) {
        int result = vel + 100;
        return super.sumarVelocidad(result);
    }
}
