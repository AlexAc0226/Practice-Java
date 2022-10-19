package com.automovil;

public class PolimorfismoMain {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        // Polimorfismo
        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        // instanceof: devuelve true si el objeto es de la clase indicada
        if (coche4 instanceof CocheElectrico) {
            System.out.println("Es un coche eléctrico");
        }
        if (coche4 instanceof Coche) {
            System.out.println("Es un coche noraml");
        }

        // "Resumen de polimorfismo"
        // Al usar polimorfismo estamos utilizando la clase padre para referirnos a los objetos de las clases hijas, es decir, no solo referenciamos a la clase hija tambien a la clase padre.
        // Esto nos permite utilizar los metodos de la clase padre para referirnos a los objetos de las clases hijas.
        // Un ejemplo en donde nos podria servir el polimorfismo es en el caso de que queramos crear un array de coches, donde queramos meter coches normales, coches electricos y coches hibridos.

    }
}
