package com.automovil.Interfaces;

import com.automovil.Coche;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche deportivo");
        return null;
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche deportivo");
    }
}
