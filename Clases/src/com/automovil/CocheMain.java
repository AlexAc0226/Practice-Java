package com.automovil;

public class CocheMain {
    public static void main(String[] args) {


        Coche cocheObj = new Coche("Rojo", "Ferrari", "F40", 1000.0, 4.0, 250);

        Coche cocheObj2 = new Coche();
        cocheObj2.sumarVelocidad(100);
        System.out.println(cocheObj2.velocidad);

        CocheHibrido cocheHibridoObj = new CocheHibrido();
        cocheHibridoObj.color = "Verde";
        cocheHibridoObj.fabricante = "Toyota";
        cocheHibridoObj.motorHibrido = "Hibrido";
        // Resultado de velocidad es de 200 porque se sobreescribe el metodo sumarVelocidad() de la clase padre Coche
        cocheHibridoObj.velocidad = 100;
        cocheHibridoObj.sumarVelocidad(100);
        System.out.println(cocheHibridoObj);

        CocheElectrico cocheElectricoObj = new CocheElectrico();
        cocheElectricoObj.color = "Azul";
        cocheElectricoObj.fabricante = "Tesla";
        cocheElectricoObj.motorElectrico = "Electrico";
        System.out.println(cocheElectricoObj);

        CocheElectrico cocheElectricoObj2 = new CocheElectrico("Azul", "Tesla", "Model S", 1000.0, 4.0, 12, "Electrico");
        cocheElectricoObj2.sumarVelocidad(11);
        System.out.println(cocheElectricoObj2.velocidad);


    }


}
