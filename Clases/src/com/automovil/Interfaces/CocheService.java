package com.automovil.Interfaces;

import com.automovil.Coche;

public interface CocheService {
    Coche crearCocheDemo(); // Esto es un método abstracto, no tiene cuerpo (no tiene llaves)
    void destruirCoche(Coche coche);
}
