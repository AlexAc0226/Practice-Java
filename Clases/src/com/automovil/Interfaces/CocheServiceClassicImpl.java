package com.automovil.Interfaces;

import com.automovil.Coche;
import com.automovil.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {
    // CocheService es una interfaz, no se puede instanciar, por lo tanto se crea una clase que implemente la interfaz
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche clasico");
    }

}
