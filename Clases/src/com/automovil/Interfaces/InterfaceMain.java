package com.automovil.Interfaces;

import com.automovil.Coche;

public class InterfaceMain {
    public static void main(String[] args) {
        // Usando concepto de polimorfismo
        //  - Se crea una variable de tipo CocheService
        CocheService service1 = new CocheServiceClassicImpl();
        Coche coche1 = service1.crearCocheDemo();

        // service1.destruirCoche(coche);
    }
}

