package com.automovil;

public class CocheMain {
    public static void main(String[] args) {

        // Instanciar un objeto de la clase Coche
        Coche cocheObj = new Coche("Rojo", "Ferrari", "F40", 1000.0, 4.0, 250);
        Coche cocheObj2 = new Coche();

        cocheObj2.sumarVelocidad(100);
        System.out.println(cocheObj2.velocidad);
    }


}
